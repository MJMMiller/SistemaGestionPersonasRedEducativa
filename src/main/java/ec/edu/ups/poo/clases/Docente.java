package ec.edu.ups.poo.clases;

public class Docente extends Persona {

    private String[] titulosAcademicos;
    private String areaEspecializacion;

    public Docente() {}

    public Docente(String cedula, String nombre, String apellido, String telefono, String correo, String[] direccion, String[] institucion, String[] titulosAcademicos, String areaEspecializacion) {
        super(cedula, nombre, apellido, telefono, correo, direccion, institucion);
        this.titulosAcademicos = titulosAcademicos;
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public String[] getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(String[] titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    @Override
    public String toString() {
        return "Docente{" + "titulosAcademicos: " + String.join(", ", titulosAcademicos) + "areaEspecializacion: " + areaEspecializacion +  " / "  + ", " + super.toString() + '}';
    }
}