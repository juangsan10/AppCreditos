
package co.com.poli.appcredito.data;

import co.com.poli.appcredito.model.Credito;
import java.util.ArrayList;
import java.util.List;


public class creditoData {
    private static List<Credito> listaCredito;
    
    static{
        listaCredito = new ArrayList<Credito>(){
            {
                add(new Credito("01", "103873663", "JUAN SANCHEZ", "500","Independiente","Vivienda","si"));
                add(new Credito("02", "1717171", "PABLO LONDONO", "600","Dependiente","Estudio","si"));
                add(new Credito("03", "17673638", "DANIEL LOPEZ", "3000","Dependiente","Libre inversion","no"));
            }  
        };
    }

    public static List<Credito> getListaCredito() {
        return listaCredito;
    }

    public static void setListaCredito(List<Credito> aListaCredito) {
        listaCredito = aListaCredito;
    }
    
    
}
