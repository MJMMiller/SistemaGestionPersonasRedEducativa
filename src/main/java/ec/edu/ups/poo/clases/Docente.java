package ec.edu.ups.poo.clases;

import java.util.List;

public class Docente extends Persona {

    private List<String> titulosAcademicos;
    private List<String> areaEspecializacion;

    public Docente() {}

    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> titulosAcademicos, List<String> areaEspecializacion) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.titulosAcademicos = titulosAcademicos;
        this.areaEspecializacion = areaEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(List<String> areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areaEspecializacion=" + areaEspecializacion +
                '}';
    }
}