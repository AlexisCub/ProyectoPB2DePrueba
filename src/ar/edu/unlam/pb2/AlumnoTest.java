package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class AlumnoTest {


    @Test
    public void testRegistrarAsistencia() {
        String nombreAlumno = "Juan";
        String apellidoAlumno = "García";
        int edadAlumno = 5;
        Integer dniAlumno = 12345678;
        LocalDate fecha = LocalDate.of(2024, 9, 25);

        Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, dniAlumno);
        alumno.registrarAsistencia(fecha, true);

        assertEquals(1, alumno.getAsistencias().size());
    }

    @Test
    public void testMostrarAsistencia() {
        String nombreAlumno = "Juan";
        String apellidoAlumno = "García";
        int edadAlumno = 5;
        Integer dniAlumno = 12345678;
        LocalDate fecha = LocalDate.of(2024, 9, 25);

        Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, dniAlumno);
        alumno.registrarAsistencia(fecha, true);

        assertNotNull(alumno.getAsistencias());
    }

    @Test
    public void testRegistrarNota() {
        String nombreAlumno = "Juan";
        String apellidoAlumno = "García";
        int edadAlumno = 5;
        Integer dniAlumno = 12345678;
        Evaluacion evaluacion = new Evaluacion(LocalDate.of(2024, 9, 25), "Matemáticas", 8);

        Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, dniAlumno);
        alumno.registrarNota(evaluacion);

        assertEquals(1, alumno.getEvaluaciones().size());
    }

    @Test
    public void testMostrarNota() {
        String nombreAlumno = "Juan";
        String apellidoAlumno = "García";
        int edadAlumno = 5;
        Integer dniAlumno = 12345678;
        Evaluacion evaluacion = new Evaluacion(LocalDate.of(2024, 9, 25), "Matemáticas", 8);

        Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, dniAlumno);
        alumno.registrarNota(evaluacion);

        assertNotNull(alumno.getEvaluaciones());
        assertTrue(alumno.getEvaluaciones().contains(evaluacion));
    }

    @Test
    public void testGetEvaluaciones() {
        String nombreAlumno = "Juan";
        String apellidoAlumno = "García";
        int edadAlumno = 5;
        Integer dniAlumno = 12345678;
        Evaluacion evaluacion = new Evaluacion(LocalDate.of(2024, 9, 25), "Matemáticas", 8);

        Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, dniAlumno);
        alumno.registrarNota(evaluacion);

        assertEquals(1, alumno.getEvaluaciones().size());
    }

    @Test
    public void testGetAsistencias() {
        String nombreAlumno = "Juan";
        String apellidoAlumno = "García";
        int edadAlumno = 5;
        Integer dniAlumno = 12345678;
        LocalDate fecha = LocalDate.of(2024, 9, 25);

        Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, dniAlumno);
        alumno.registrarAsistencia(fecha, true);

        assertEquals(1, alumno.getAsistencias().size());
    }
}
