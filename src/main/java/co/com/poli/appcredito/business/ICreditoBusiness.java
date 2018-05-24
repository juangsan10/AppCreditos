
package co.com.poli.appcredito.business;

import co.com.poli.appcredito.model.Credito;
import java.util.List;

public interface ICreditoBusiness {
    
    List<Credito> ObtenerListaCursos();
    Credito obtenerCurso(String idCurso);
    String crearCurso(Credito curso);
    String modificarCurso(Credito curso);
    String eliminarCurso(String idCurso);
}
