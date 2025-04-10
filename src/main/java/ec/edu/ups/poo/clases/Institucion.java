package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;

public class Institucion {

    private int id;
    private String nombre;
    private List<String> sede;

    private Direccion direccion;

    private List<Asignacion> asignaciones;

    public Institucion() {
        this.sede = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public Institucion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.sede = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void addDireccion(String pais, String provincia, String ciudad, String callePrincipal, String calleSecundaria, String numeracion, TipoDireccion tipo) {
        this.direccion = new Direccion(pais, provincia, ciudad, callePrincipal, calleSecundaria, numeracion, tipo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSede() {
        return sede;
    }

    public void addSede(String sede) {
        this.sede.add(sede);
    }

    public void setSede(List<String> sede) {
        this.sede = sede;
    }

    public void addAsignaciones(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sede +
                ", asignaciones=" + asignaciones +
                ", direccion=" + direccion +
                '}';
    }
}