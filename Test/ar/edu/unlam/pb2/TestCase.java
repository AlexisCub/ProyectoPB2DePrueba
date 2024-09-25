package ar.edu.unlam.pb2;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class TestCase {
    
	@Test
	public void testCrearAlumno() {
	    // Preparacion
	    String nombre = "Juan";
	    int edad = 5;
	    Integer dni = 12345678;

	    // Ejecucion
	    Alumno alumno = new Alumno(nombre, edad, dni);

	    // Verificacion
	    Assert.assertEquals(nombre, alumno.getNombre());
	    Assert.assertEquals(edad, alumno.getEdad());
	    Assert.assertEquals(dni, alumno.getDni());
	    Assert.assertEquals("Roja", alumno.getColorSala());
	    Assert.assertEquals(0, alumno.getGradoAsignado());
	}

	
	@Test
	public void testAsignarColorSala() {
	    // Preparacion
	    String nombreAlumno1 = "Ana";
	    int edadAlumno1 = 3;
	    Integer dniAlumno1 = 87654321;

	    String nombreAlumno2 = "Pedro";
	    int edadAlumno2 = 4;
	    Integer dniAlumno2 = 11223344;

	    // Ejecucion
	    Alumno alumno1 = new Alumno(nombreAlumno1, edadAlumno1, dniAlumno1);
	    Alumno alumno2 = new Alumno(nombreAlumno2, edadAlumno2, dniAlumno2);

	    // Verificacion
	    Assert.assertEquals("Verde", alumno1.getColorSala());
	    Assert.assertEquals("Azul", alumno2.getColorSala());
	}

	@Test
	public void testAsignarGrado() {
	    // Preparacion
	    String nombreAlumno1 = "Lucia";
	    int edadAlumno1 = 7;
	    Integer dniAlumno1 = 33445566;

	    String nombreAlumno2 = "Carlos";
	    int edadAlumno2 = 14;
	    Integer dniAlumno2 = 77889900;

	    // Ejecucion
	    Alumno alumno1 = new Alumno(nombreAlumno1, edadAlumno1, dniAlumno1);
	    Alumno alumno2 = new Alumno(nombreAlumno2, edadAlumno2, dniAlumno2);

	    // Verificacion
	    Assert.assertEquals(2, alumno1.getGradoAsignado());
	    Assert.assertEquals(3, alumno2.getGradoAsignado());
	}
	
	
	@Test
	public void testRegistrarNota() {
	    // Preparacion
	    String nombreAlumno = "Sofia";
	    int edadAlumno = 10;
	    Integer dniAlumno = 22334455;
	    Evaluacion evaluacion = new Evaluacion("Matematicas", 8);

	    // Ejecucion
	    Alumno alumno = new Alumno(nombreAlumno, edadAlumno, dniAlumno);
	    alumno.registrarNota(evaluacion);

	    // Verificacion
	    Assert.assertEquals(1, alumno.getEvaluaciones().size());
	}

	@Test
	public void testRegistrarAsistencia() {
	    // Preparacion
	    String nombreAlumno = "Marta";
	    int edadAlumno = 6;
	    Integer dniAlumno = 11122333;
	    LocalDate fecha = LocalDate.now();

	    // Ejecucion
	    Alumno alumno = new Alumno(nombreAlumno, edadAlumno, dniAlumno);
	    alumno.registrarAsistencia(fecha, true);

	    // Verificacion
	    Assert.assertEquals(1, alumno.getAsistencias().size());
	}

	
	@Test
    public void testCrearDocente() {
        // Preparacion
        String nombre = "Maria";
        Integer dni = 87654321;
        int[] gradosExperiencia = {1, 2};
        Docente docente = new Docente(nombre, dni, gradosExperiencia);

        // Ejecucion
        String nombreDocente = docente.getNombre();
        Integer dniDocente = docente.getDni();
        int[] experienciaDocente = docente.getGradoExperiencia();

        // Verificacion
        Assert.assertEquals(nombre, nombreDocente);
        Assert.assertEquals(dni, dniDocente);
        Assert.assertArrayEquals(gradosExperiencia, experienciaDocente);
    }
	
	@Test
	public void testPuedeCorregir() {
	    // Preparacion
	    int[] gradosExperiencia = {2, 3};
	    Docente docente = new Docente("Ana", 23456789, gradosExperiencia);
	    Alumno alumno = new Alumno("Pedro", 8, 12345678);

	    // Ejecucion
	    boolean resultado = docente.puedeCorregir(alumno);

	    // Verificacion
	    Assert.assertTrue(resultado);
	}

	@Test
	public void testAgregarAlumnoAJardin() {
	    // Preparacion
	    Sala sala = new Sala("Sala Azul", 0);
	    Alumno alumno = new Alumno("Pedro", 4, 12345678);

	    // Ejecucion
	    sala.agregarAlumno(alumno);

	    // Verificacion
	    Assert.assertEquals(1, sala.getCantidadAlumnos());
	}

	@Test
	public void testAgregarDocenteAJardin() {
	    // Preparacion
	    Sala sala = new Sala("Sala Verde", 0);
	    Docente docente1 = new Docente("Ana", 23456789, new int[] {0});
	    Docente docente2 = new Docente("Luis", 12345678, new int[] {0});

	    // Ejecucion
	    sala.agregarDocente(docente1);
	    sala.agregarDocente(docente2);

	    // Verificacion
	    Assert.assertEquals(2, sala.getDocentes().size());
	}

	@Test
	public void testAgregarMasDeUnDocenteAPrimaria() {
	    // Preparacion
	    Sala sala = new Sala("Primer Grado", 1);
	    Docente docente1 = new Docente("Carlos", 34567890, new int[] {1});
	    Docente docente2 = new Docente("Marta", 45678901, new int[] {1});

	    // Ejecucion
	    sala.agregarDocente(docente1);
	    sala.agregarDocente(docente2);

	    // Verificacion
	    Assert.assertEquals(1, sala.getDocentes().size());
	}
	
	@Test
	public void testAsignarDocentePorMateriaASecundaria() {
	    // Preparacion
	    Sala sala = new Sala("Secundaria 1ro", 7);
	    Docente docente = new Docente("Fernando", 98765432, new int[] {7});
	    
	    // Ejecucion
	    sala.asignarDocentePorMateria("Matematicas", docente);

	    // Verificacion
	    Assert.assertEquals(1, sala.getDocentesSecundaria().size());
	    Assert.assertEquals(1, sala.getMaterias().size());
	}


	@Test
	public void testCrearTrue() {
	    // Preparación
	    LocalDate fecha = LocalDate.of(2024, 9, 25);
	    boolean asistio = true;

	    // Ejecución
	    Asistencia asistencia = new Asistencia(fecha, asistio);

	    // Verificación
	    Assert.assertEquals(fecha, asistencia.getFecha());
	    Assert.assertTrue(asistencia.getAsistio());
	}

	@Test
	public void testCrearFalse() {
	    // Preparación
	    LocalDate fecha = LocalDate.of(2024, 9, 25);
	    boolean asistio = false;

	    // Ejecución
	    Asistencia asistencia = new Asistencia(fecha, asistio);

	    // Verificación
	    Assert.assertEquals(fecha, asistencia.getFecha());
	    Assert.assertFalse(asistencia.getAsistio());
	}
	
	@Test
	public void testCrearEvaluacionConMateriaYNota() {
	    // Preparación
	    String materia = "Matemáticas";
	    int nota = 8;

	    // Ejecución
	    Evaluacion evaluacion = new Evaluacion(materia, nota);

	    // Verificación
	    Assert.assertEquals(materia, evaluacion.getMateria());
	    Assert.assertEquals(nota, evaluacion.getNota());
	}


}
