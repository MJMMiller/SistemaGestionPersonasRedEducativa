package ec.edu.ups.poo.clases;

public class Estudiante extends Persona {

    private String carrera;
    private String matricula;

    public Estudiante() {}

    public Estudiante(String carrera, String matricula, String cedula, String nombre, String apellido, String telefono, String correo, String[] direccion, String[] institucion) {
        super(cedula, nombre, apellido, telefono, correo, direccion, institucion);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera: " + carrera +  " / "  + "matricula: " + matricula +  " / "  + ", " + super.toString() + '}';
    }
}