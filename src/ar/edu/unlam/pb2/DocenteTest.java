package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.time.LocalDate;

public class DocenteTest {

    @Test
    public void testGetNombre() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertEquals("Carlos", docente.getNombre());
    }

    @Test
    public void testGetDni() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertEquals((Integer) 12345678, docente.getDni());
    }


    @Test
    public void testGetGradoExperiencia() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertArrayEquals(gradosExperiencia, docente.getGradoExperiencia());
    }

    @Test
    public void testPuedeCorregir() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};
        Alumno alumno = new Alumno("Juan", "Garcia", 7, 12345678);

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertTrue(docente.puedeCorregir(alumno));
    }

    @Test
    public void testNoPuedeCorregir() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};
        Alumno alumno = new Alumno("Pedro", "Perez", 4, 87654321);

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertFalse(docente.puedeCorregir(alumno));
    }

    @Test
    public void testCorregirEvaluacion() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};
        Alumno alumno = new Alumno("Juan", "Garcia", 7, 12345678);
        Evaluacion evaluacion = new Evaluacion(LocalDate.of(2024, 9, 25), "Matematicas", 8);

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertTrue(docente.puedeCorregir(alumno));

        docente.corregirEvaluacion(alumno, evaluacion.getCurso(), evaluacion.getNota(), evaluacion.getFecha());

        assertEquals(1, alumno.getEvaluaciones().size());
    }

    @Test
    public void testNoCorregirEvaluacion() {
        String nombreDocente = "Carlos";
        Integer dniDocente = 12345678;
        int[] gradosExperiencia = {2, 3};
        Alumno alumno = new Alumno("Pedro", "Perez", 4, 87654321);
        Evaluacion evaluacion = new Evaluacion(LocalDate.of(2024, 9, 25), "Matematicas", 8);

        Docente docente = new Docente(nombreDocente, dniDocente, gradosExperiencia);

        assertFalse(docente.puedeCorregir(alumno));

        docente.corregirEvaluacion(alumno, evaluacion.getCurso(), evaluacion.getNota(), evaluacion.getFecha());

        assertEquals(0, alumno.getEvaluaciones().size());
    }
}
