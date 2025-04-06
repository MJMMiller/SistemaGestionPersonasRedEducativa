package ec.edu.ups.poo.clases;

public class Institucion {

    private String idInstitucion;
    private String nombre;
    private String[] sede;

    public Institucion() {}

    public Institucion(String idInstitucion, String nombre, String[] sede) {
        this.idInstitucion = idInstitucion;
        this.nombre = nombre;
        this.sede = sede;
    }

    public String getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getSede() {
        return sede;
    }

    public void setSede(String[] sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Institucion{" + "idInstitucion: " + idInstitucion +  " / "  + "nombre: " + nombre +  " / "  + "sede: " + String.join(", ", sede) + '}';
    }
}