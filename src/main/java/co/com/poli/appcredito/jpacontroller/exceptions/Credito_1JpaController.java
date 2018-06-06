/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcredito.jpacontroller.exceptions;

import co.com.poli.appcredito.jpacontroller.exceptions.exceptions.NonexistentEntityException;
import co.com.poli.appcredito.jpacontroller.exceptions.exceptions.PreexistingEntityException;
import co.com.poli.appcredito.model.Credito_1;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author JUAN G
 */
public class Credito_1JpaController implements Serializable {

    public Credito_1JpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Credito_1 credito_1) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(credito_1);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCredito_1(credito_1.getNumerocredito()) != null) {
                throw new PreexistingEntityException("Credito_1 " + credito_1 + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Credito_1 credito_1) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            credito_1 = em.merge(credito_1);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = credito_1.getNumerocredito();
                if (findCredito_1(id) == null) {
                    throw new NonexistentEntityException("The credito_1 with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Credito_1 credito_1;
            try {
                credito_1 = em.getReference(Credito_1.class, id);
                credito_1.getNumerocredito();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The credito_1 with id " + id + " no longer exists.", enfe);
            }
            em.remove(credito_1);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Credito_1> findCredito_1Entities() {
        return findCredito_1Entities(true, -1, -1);
    }

    public List<Credito_1> findCredito_1Entities(int maxResults, int firstResult) {
        return findCredito_1Entities(false, maxResults, firstResult);
    }

    private List<Credito_1> findCredito_1Entities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Credito_1.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Credito_1 findCredito_1(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Credito_1.class, id);
        } finally {
            em.close();
        }
    }

    public int getCredito_1Count() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Credito_1> rt = cq.from(Credito_1.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
      public List<Credito_1> findCreditos(String tCred){
        EntityManager em = getEntityManager();             
        Query query = em.createNamedQuery("Credito_1.findByTipocredito");
        query.setParameter("tipoCredito", tCred);
        return query.getResultList();
    }

}
