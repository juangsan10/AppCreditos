
package co.com.poli.appcredito.dao.implementation;

import co.com.poli.appcredito.data.creditoData;
import co.com.poli.appcredito.model.Credito;
import java.util.List;
import co.com.poli.appcredito.dao.ICreditoDao;


public abstract class CreditoDaoImpl implements ICreditoDao{

    public List<Credito> ObtenerListaCredito() {
        return creditoData.getListaCredito();
    }

    public Credito obtenerCredito(String idCredito) {
        Credito credito = null;
        List<Credito> listaCredito = creditoData.getListaCredito();
        for (Credito CreditoList : listaCredito) {
            if (CreditoList.getIdCredito().equals(idCredito)) {
                credito = CreditoList;
            }

        }
        return credito;
    }

    public String crearCredito(Credito credito) {
        List<Credito> listaCredito = creditoData.getListaCredito();
        listaCredito.add(credito);
        creditoData.setListaCredito(listaCredito);
        return "Curso creado";
    }


    public String modificarCredito(Credito curso) {
        List<Credito> listaCursos = creditoData.getListaCredito();
        listaCursos.set(listaCursos.indexOf(curso), curso);
        creditoData.setListaCredito(listaCursos);
        return "Curso Modificado";
    }


    public String eliminarCredito(String idCredito) {
        List<Credito> listaCredito= creditoData.getListaCredito();
        listaCredito.remove(obtenerCredito(idCredito));
        creditoData.setListaCredito(listaCredito);
        return "Curso Eliminado";
    }

   
    
}
