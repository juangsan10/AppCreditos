
package co.com.poli.appcredito.business.implementation;

import co.com.poli.appcredito.dao.implementation.CreditoDaoImpl;
import co.com.poli.appcredito.model.Credito;
import java.util.List;
import co.com.poli.appcredito.business.ICreditoBusiness;


public  class CreditoBusinessImpl implements ICreditoBusiness {

    private CreditoDaoImpl cursoDaoImpl = new CreditoDaoImpl() {};

    @Override
    public List<Credito> ObtenerListaCredito() {
        return cursoDaoImpl.ObtenerListaCredito();
    }

    @Override
    public Credito obtenerCredito(String idCredito) {
        return cursoDaoImpl.obtenerCredito(idCredito);
    }

    public String crearCredito(Credito credito) {
        String respuesta = "Credito creado";
        Credito cur = obtenerCredito(credito.getIdCredito());
        if (cur == null) {
            respuesta = cursoDaoImpl.crearCredito(credito);
        }
        return respuesta;
    }

    @Override
    public String modificarCredito(Credito credito) {
        String respuesta = "Credito no existe";
        Credito cur = obtenerCredito(credito.getIdCredito());
        if (cur != null){
            respuesta = cursoDaoImpl.modificarCredito(credito);
        }
        return respuesta;
    }

    @Override
    public String eliminarCredito(String idCredito) {
        String respuesta = "Credito no existe";
        Credito cur = obtenerCredito(idCredito);
        if (cur != null){
            respuesta = cursoDaoImpl.eliminarCredito(idCredito);
        }
        return respuesta;
    }

   

}
