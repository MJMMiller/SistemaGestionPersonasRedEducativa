package ec.edu.ups.poo.clases;

public class Administrativo extends Persona{

    private String[] cargo;
    private String[] responsabilidad;

    public Administrativo() {}

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correo, String[] direccion, String[] institucion, String[] cargo, String[] responsabilidad) {

        super(cedula, nombre, apellido, telefono, correo, direccion, institucion);
        this.cargo = cargo;
        this.responsabilidad = responsabilidad;
    }

    public String[] getCargo() {
        return cargo;
    }

    public void setCargo(String[] cargo) {
        this.cargo = cargo;
    }

    public String[] getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String[] responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "cargo: " + String.join(", ", cargo) + " / " + "responsabilidad: " + String.join(", ", responsabilidad) + ", " + super.toString() + '}';
    }
}
