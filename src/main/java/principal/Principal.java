package principal;

import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.enums.Rol;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Institucion institucion1 = new Institucion(1, "Institución Educativa A");
        Institucion institucion2 = new Institucion(2, "Institución Educativa B");

        institucion1.addDireccion("Ecuador", "Pichincha", "Quito", "Av. Amazonas", "Av. República", "123", TipoDireccion.INSTITUCION);
        institucion2.addDireccion("Ecuador", "Guayas", "Guayaquil", "Malecón 2000", "9 de Octubre", "456", TipoDireccion.INSTITUCION);

        institucion1.addSede("Quito Centro");
        institucion1.addSede("Quito Norte");
        institucion2.addSede("Guayaquil Sur");
        institucion2.addSede("Guayaquil Norte");

        Estudiante estudiante = new Estudiante("0102030405", "Juan", "Pérez", "0987654321", "juan.perez@example.com", "Ingeniería en Sistemas");
        Docente docente = new Docente("0203040506", "María", "Gómez", "0998765432", "maria.gomez@example.com", List.of("Licenciatura en Matemáticas"), List.of("Cálculo", "Estadística"));
        Administrativo administrativo = new Administrativo("0304050607", "Carlos", "Ramírez", "0976543210", "carlos.ramirez@example.com", List.of("Jefe de Recursos Humanos"), List.of("Gestión del personal", "Contrataciones"));
        Visitante visitante = new Visitante("0405060708", "Ana", "Torres", "0965432109", "ana.torres@example.com", "Entrevista laboral", new GregorianCalendar(2025, 4, 10), new GregorianCalendar(2025, 4, 10));

        estudiante.addDireccion(new Direccion("Ecuador", "Pichincha", "Quito", "Calle 1", "Calle 2", "789", TipoDireccion.CASA));
        docente.addDireccion(new Direccion("Ecuador", "Pichincha", "Quito", "Calle 3", "Calle 4", "101", TipoDireccion.TRABAJO));
        administrativo.addDireccion(new Direccion("Ecuador", "Guayas", "Guayaquil", "Calle 5", "Calle 6", "202", TipoDireccion.CASA));
        visitante.addDireccion(new Direccion("Ecuador", "Guayas", "Guayaquil", "Calle 7", "Calle 8", "303", TipoDireccion.TRABAJO));

        institucion1.addAsignaciones(new Asignacion(estudiante, new GregorianCalendar(2025, 4, 10), Rol.ESTUDIANTE));
        institucion1.addAsignaciones(new Asignacion(docente, new GregorianCalendar(2025, 4, 10), Rol.DOCENTE));
        institucion2.addAsignaciones(new Asignacion(administrativo, new GregorianCalendar(2025, 4, 10), Rol.ADMINISTRATIVO));
        institucion2.addAsignaciones(new Asignacion(visitante, new GregorianCalendar(2025, 4, 10), Rol.VISITANTE));

        System.out.println("Información de las instituciones:");
        System.out.println(institucion1);
        System.out.println(institucion2);
    }
}