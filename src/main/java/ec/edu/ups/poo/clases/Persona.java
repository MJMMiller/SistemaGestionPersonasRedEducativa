package ec.edu.ups.poo.clases;

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String[] direccion;
    private String[] institucion;

    public Persona() {}

    public Persona(String cedula, String nombre, String apellido, String telefono, String correo, String[] direccion, String[] institucion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.institucion = institucion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    public String[] getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String[] institucion) {
        this.institucion = institucion;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula: " + cedula +  " / "  + "nombre: " + nombre +  " / "  + "apellido: " + apellido +  " / "  + "telefono: " + telefono +  " / "  + "correo: " + correo +  " / "  + "direccion: " + String.join(", ", direccion) + "institucion: " + String.join(", ", institucion) + '}';
    }
}