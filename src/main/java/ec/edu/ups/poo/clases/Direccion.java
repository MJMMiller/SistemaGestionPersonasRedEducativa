package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

public class Direccion {

    private String pais;
    private String provincia;
    private String ciudad;
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;
    private TipoDireccion tipo;

    public Direccion() {}

    public Direccion(String pais, String provincia, String ciudad, String callePrincipal, String calleSecundaria, String numeracion, TipoDireccion tipo) {
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public TipoDireccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDireccion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", callePrincipal='" + callePrincipal + '\'' +
                ", calleSecundaria='" + calleSecundaria + '\'' +
                ", numeracion='" + numeracion + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}