public class Docente {

    private String nombre;
    private int[] gradoExperiencia;

    public Docente(String nombre, int[] gradoExperiencia) {
        this.nombre = nombre;
        this.gradoExperiencia = gradoExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getGradoExperiencia() {
        return gradoExperiencia;
    }


    private boolean puedeCorregir(Alumno alumno) {
        int gradoAlumno = alumno.getGradoAsignado();
        for (int i = 0; i < gradoExperiencia.length; i++) {
            if (gradoExperiencia[i] == gradoAlumno) {
                return true;
            }
        }
        return false;
    }

    public void corregirEvaluacion(Alumno alumno, String materia, int nota) {
        if (puedeCorregir(alumno)) {
            Evaluacion evaluacion = new Evaluacion(materia, nota);
            alumno.registrarNota(evaluacion);
            System.out.println("\nEvaluación de "+ alumno.getNombre() + " fue corregida por el docente " + nombre + ": " + materia + " // Nota: " + nota);
        } else {
            System.out.println("\nEl docente " + nombre + " no tiene puede corregir el examen de " + alumno.getNombre());
        }
    }
}
