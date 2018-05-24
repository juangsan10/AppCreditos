
package co.com.poli.appcredito.model;

import java.util.Objects;


public class Credito {
    private String idCredito;
    private String documento;
    private String nombreyapellido;
    private String monto;
    private String tipodetrabajador;
    private String tipodecredito;
    private String trabaja;

    public Credito(String idCredito, String documento, String nombreyapellido, String monto, String tipodetrabajador, String tipodecredito, String trabaja) {
        this.idCredito = idCredito;
        this.documento = documento;
        this.nombreyapellido = nombreyapellido;
        this.monto = monto;
        this.tipodetrabajador = tipodetrabajador;
        this.tipodecredito = tipodecredito;
        this.trabaja = trabaja;
    }

    public String getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(String idCredito) {
        this.idCredito = idCredito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTipodetrabajador() {
        return tipodetrabajador;
    }

    public void setTipodetrabajador(String tipodetrabajador) {
        this.tipodetrabajador = tipodetrabajador;
    }

    public String getTipodecredito() {
        return tipodecredito;
    }

    public void setTipodecredito(String tipodecredito) {
        this.tipodecredito = tipodecredito;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }
    

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.idCredito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credito other = (Credito) obj;
        if (!Objects.equals(this.idCredito, other.idCredito)) {
            return false;
        }
        return true;
    }
    
    
}
