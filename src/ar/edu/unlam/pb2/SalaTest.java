package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaTest {

    @Test
    public void testAgregarAlumno() throws AlumnoInscriptoException {
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Alumno alumno1 = new Alumno("Juan", "Garcia", 7, 12345678);
        
        segundoGrado.agregarAlumno(alumno1);
        
        assertEquals(1, segundoGrado.getCantidadAlumnos());
    }

    @Test
    public void testAgregarDocenteSecundaria() {
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Docente docente1 = new Docente("Marcelo", 40642181, new int[]{2, 3, 6});
        Docente docente2 = new Docente("Esteban", 40642187, new int[]{3, 4});

        segundoGrado.agregarDocenteSecundaria(docente1);
        assertTrue(segundoGrado.getDocentesSecundaria().contains(docente1));

        segundoGrado.agregarDocenteSecundaria(docente2);
        assertFalse(segundoGrado.getDocentesSecundaria().contains(docente2));
    }

    @Test
    public void testAsignarDocentePorMateria() {
        Sala segundoAño = new Sala("Segundo Año", 2);
        Docente docente1 = new Docente("Marcelo", 40642181, new int[]{2, 3, 6});

        segundoAño.asignarDocentePorMateria("Matemáticas", docente1);
        
        assertTrue(segundoAño.getMaterias().contains("Matemáticas"));
        assertTrue(segundoAño.getDocentesSecundaria().contains(docente1));
    }

    @Test
    public void testListaAlumnosOrdenados() throws AlumnoInscriptoException {
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Alumno alumno1 = new Alumno("Juan", "Garcia", 7, 12345678);
        Alumno alumno2 = new Alumno("Maria", "Lopez", 7, 87654321);

        segundoGrado.agregarAlumno(alumno1);
        segundoGrado.agregarAlumno(alumno2);

        segundoGrado.listaAlumnosOrdenados();
    }

    @Test
    public void testListaAlumnosPorDNI() throws AlumnoInscriptoException {
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Alumno alumno1 = new Alumno("Juan", "Garcia", 7, 12345678);
        Alumno alumno2 = new Alumno("Maria", "Lopez", 7, 87654321);

        segundoGrado.agregarAlumno(alumno1);
        segundoGrado.agregarAlumno(alumno2);

        segundoGrado.listaAlumnosPorDNI();
    }

    @Test
    public void testBuscarAlumnoPorDNI() throws AlumnoInscriptoException, AlumnoNoEncontradoException {
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Alumno alumno1 = new Alumno("Juan", "Garcia", 7, 12345678);
        Alumno alumno2 = new Alumno("Maria", "Lopez", 7, 87654321);
        int dniBuscar = 11001100;

        segundoGrado.agregarAlumno(alumno1);
        segundoGrado.agregarAlumno(alumno2);

        Alumno encontrado = segundoGrado.buscarAlumnoPorDNI(12345678);
        
        assertEquals(alumno1, encontrado);

        try {
            segundoGrado.buscarAlumnoPorDNI(dniBuscar);
            fail("AlumnoNoEncontradoException");
            
        } 
        catch (AlumnoNoEncontradoException e) {
        	
            assertEquals("Alumno con DNI " + dniBuscar + " no encontrado", e.getMessage());
        }
    }

}
