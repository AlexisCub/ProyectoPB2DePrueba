package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {


    @Test
    public void testAgregarAlumno() {
        Curso curso = new Curso();
        Alumno alumno = new Alumno("Juan", "Garcia", 7, 12345678);

        try {
            curso.agregarAlumno(alumno);
        } catch (AlumnoInscriptoException e) {
            fail("" + e.getMessage());
        }

        assertEquals(1, curso.getCantidadAlumnos());
        assertTrue(curso.getAlumnos().contains(alumno));
    }

    @Test
    public void testAgregarAlumnoDuplicado() {
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Alumno alumno1 = new Alumno("Juan", "Garcia", 7, 12345678);
        Alumno alumno2 = new Alumno("Juan", "Garcia", 7, 12345678); 

        try {
            segundoGrado.agregarAlumno(alumno1);
            segundoGrado.agregarAlumno(alumno2);
            fail("AlumnoInscriptoException");
        } catch (AlumnoInscriptoException e) {
            assertEquals("El alumno con DNI " + alumno1.getDni() + " ya esta inscrito", e.getMessage());
        }

        assertEquals(1, segundoGrado.getCantidadAlumnos());
    }

    @Test
    public void testAgregarDocente() {
        Curso curso = new Curso();
        Docente docente = new Docente("Carlos", 12345678, new int[] {2, 3});

        try {
            curso.agregarDocente(docente);
        } catch (CantidadMaximaDocentesException e) {
            fail(" " + e.getMessage());
        }

        assertEquals(1, curso.getDocentes().size());
        assertTrue(curso.getDocentes().contains(docente));
    }

    @Test
    public void testAgregarDocenteConExcepcion() {
        Curso curso = new Curso();
        Docente docente1 = new Docente("Carlos", 12345678, new int[] {2, 3});
        Docente docente2 = new Docente("Ana", 23456789, new int[] {3, 4});

        try {
            curso.agregarDocente(docente1);
            curso.agregarDocente(docente2);
            fail("CantidadMaximaDocentesException");
            
        } catch (CantidadMaximaDocentesException e) {
        	
            assertEquals("Limite de docentes ", e.getMessage());
        }

        assertEquals(1, curso.getDocentes().size());
    }

    @Test
    public void testGetCantidadAlumnos() {
        Curso curso = new Curso();
        Alumno alumno1 = new Alumno("Juan", "Garcia", 7, 12345678);
        Alumno alumno2 = new Alumno("Ana", "Perez", 8, 23456789);

        try {
            curso.agregarAlumno(alumno1);
            curso.agregarAlumno(alumno2);
        } catch (AlumnoInscriptoException e) {
        	
            fail("" + e.getMessage());
        }

        assertEquals(2, curso.getCantidadAlumnos());
    }

}
