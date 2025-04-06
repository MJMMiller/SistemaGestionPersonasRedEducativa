package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class Visitante extends Persona {

    private String motivoVisita;
    private GregorianCalendar fechaIngreso;
    private GregorianCalendar fechaSalida;

    public Visitante() {}

    public Visitante(String motivoVisita, GregorianCalendar fechaIngreso, GregorianCalendar fechaSalida, String cedula, String nombre, String apellido, String telefono, String correo, String[] direccion, String[] institucion) {

        super(cedula, nombre, apellido, telefono, correo, direccion, institucion);

        this.motivoVisita = motivoVisita;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Visitante{" + "motivoVisita: " + motivoVisita + " / " + "fechaIngreso: " + fechaIngreso.getTime() +  " / " + "fechaSalida: " + fechaSalida.getTime() + ", " + super.toString() + '}';
    }
}
