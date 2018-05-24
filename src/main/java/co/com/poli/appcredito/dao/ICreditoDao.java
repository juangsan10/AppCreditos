
package co.com.poli.appcredito.dao;

import co.com.poli.appcredito.model.Credito;
import java.util.List;


public interface ICreditoDao {
    
    List<Credito> ObtenerListaCredito();
    Credito obtenerCredito(String idCredito);
    String crearCredito(Credito credito);
    String modificarCredito(Credito credito);
    String eliminarCredito(String idCredito);
    
}
