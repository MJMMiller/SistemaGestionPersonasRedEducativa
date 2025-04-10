package ec.edu.ups.poo.clases;

import java.util.List;

public class Administrativo extends Persona {

    private List<String> cargo;
    private List<String> responsabilidad;

    public Administrativo() {}

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> cargo, List<String> responsabilidad) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargo = cargo;
        this.responsabilidad = responsabilidad;
    }

    public List<String> getCargo() {
        return cargo;
    }

    public void setCargo(List<String> cargo) {
        this.cargo = cargo;
    }

    public List<String> getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(List<String> responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Administrativo{" +
                "cargo=" + cargo +
                ", responsabilidad=" + responsabilidad +
                '}';
    }
}