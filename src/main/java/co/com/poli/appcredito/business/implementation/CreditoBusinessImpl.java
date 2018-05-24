
package co.com.poli.appcredito.business.implementation;

import co.com.poli.appcredito.dao.implementation.CreditoDaoImpl;
import co.com.poli.appcredito.model.Credito;
import java.util.List;
import co.com.poli.appcredito.business.ICreditoBusiness;


public abstract class CreditoBusinessImpl implements ICreditoBusiness {

    private CreditoDaoImpl cursoDaoImpl = new CreditoDaoImpl() {};

    @Override
    public List<Credito> ObtenerListaCursos() {
        return cursoDaoImpl.ObtenerListaCredito();
    }

    @Override
    public Credito obtenerCurso(String idCurso) {
        return cursoDaoImpl.obtenerCredito(idCurso);
    }

    public String crearCredito(Credito curso) {
        String respuesta = "Curso creado";
        Credito cur = obtenerCurso(curso.getIdCredito());
        if (cur == null) {
            respuesta = cursoDaoImpl.crearCredito(curso);
        }
        return respuesta;
    }

    @Override
    public String modificarCurso(Credito curso) {
        String respuesta = "Curso no existe";
        Credito cur = obtenerCurso(curso.getIdCredito());
        if (cur != null){
            respuesta = cursoDaoImpl.modificarCredito(curso);
        }
        return respuesta;
    }

    @Override
    public String eliminarCurso(String idCurso) {
        String respuesta = "Curso no existe";
        Credito cur = obtenerCurso(idCurso);
        if (cur != null){
            respuesta = cursoDaoImpl.eliminarCredito(idCurso);
        }
        return respuesta;
    }

   

}
