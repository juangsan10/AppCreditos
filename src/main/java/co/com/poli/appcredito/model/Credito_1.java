/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcredito.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JUAN G
 */
@Entity
@Table(name = "credito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Credito_1.findAll", query = "SELECT c FROM Credito_1 c"),
    @NamedQuery(name = "Credito_1.findByNumerocredito", query = "SELECT c FROM Credito_1 c WHERE c.numerocredito = :numerocredito"),
    @NamedQuery(name = "Credito_1.findByDocumento", query = "SELECT c FROM Credito_1 c WHERE c.documento = :documento"),
    @NamedQuery(name = "Credito_1.findByNombreApellido", query = "SELECT c FROM Credito_1 c WHERE c.nombreApellido = :nombreApellido"),
    @NamedQuery(name = "Credito_1.findByMonto", query = "SELECT c FROM Credito_1 c WHERE c.monto = :monto"),
    @NamedQuery(name = "Credito_1.findByTipotrabajador", query = "SELECT c FROM Credito_1 c WHERE c.tipotrabajador = :tipotrabajador"),
    @NamedQuery(name = "Credito_1.findByTipocredito", query = "SELECT c FROM Credito_1 c WHERE c.tipocredito = :tipocredito"),
    @NamedQuery(name = "Credito_1.findByTrabaja", query = "SELECT c FROM Credito_1 c WHERE c.trabaja = :trabaja")})
public class Credito_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "numerocredito")
    private String numerocredito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "documento")
    private String documento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_apellido")
    private String nombreApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "monto")
    private String monto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipotrabajador")
    private String tipotrabajador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipocredito")
    private String tipocredito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "trabaja")
    private String trabaja;

    public Credito_1() {
    }

    public Credito_1(String numerocredito) {
        this.numerocredito = numerocredito;
    }

    public Credito_1(String numerocredito, String documento, String nombreApellido, String monto, String tipotrabajador, String tipocredito, String trabaja) {
        this.numerocredito = numerocredito;
        this.documento = documento;
        this.nombreApellido = nombreApellido;
        this.monto = monto;
        this.tipotrabajador = tipotrabajador;
        this.tipocredito = tipocredito;
        this.trabaja = trabaja;
    }

    public String getNumerocredito() {
        return numerocredito;
    }

    public void setNumerocredito(String numerocredito) {
        this.numerocredito = numerocredito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String getTipocredito() {
        return tipocredito;
    }

    public void setTipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerocredito != null ? numerocredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credito_1)) {
            return false;
        }
        Credito_1 other = (Credito_1) object;
        if ((this.numerocredito == null && other.numerocredito != null) || (this.numerocredito != null && !this.numerocredito.equals(other.numerocredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.poli.appcredito.model.Credito_1[ numerocredito=" + numerocredito + " ]";
    }
    
}
