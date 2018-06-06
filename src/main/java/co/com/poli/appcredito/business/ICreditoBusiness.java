
package co.com.poli.appcredito.business;

import co.com.poli.appcredito.model.Credito;
import java.util.List;

public interface ICreditoBusiness {
    
      List<Credito> ObtenerListaCredito();
    Credito obtenerCredito(String idCredito);
    String crearCredito(Credito credito);
    String modificarCredito(Credito credito);
    String eliminarCredito(String idCredito);
}
