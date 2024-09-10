import java.time.LocalDate;

public class Alumno {

    private String nombre;
    private int edad;
    private String colorSala;
    private Asistencia[] asistencias;
    private int contAsistencias;
    private Evaluacion[] evaluaciones;
    private int contEvaluaciones;
    private int gradoAsignado;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorSala = asignarColorSala(edad);
        this.asistencias = new Asistencia[3];
        this.contAsistencias = 0;
        this.evaluaciones = new Evaluacion[5];
        this.contEvaluaciones = 0;
        this.gradoAsignado = asignarGrado();
    }
    
    private String asignarColorSala(int edad) {
        if (edad <= 2) {
            return "Celeste";
        } 
        else {
            if (edad == 3) {
                return "Verde";
            } 
            else {
                if (edad == 4) {
                    return "Azul";
                } 
                else {
                    if (edad == 5) {
                        return "Roja";
                    } 
                    else {
                        return "";
                    }
                }
            }
        }
    }

    private int asignarGrado() {
        if (edad >= 6 && edad <= 11) {
            return edad - 5;
        } else {
            if (edad >= 12 && edad <= 17) {
                return edad - 11;
            } else {
                return 0;
            }
        }
    }

    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getColorSala() {
        return colorSala;
    }
    
    public int getGradoAsignado() {
        return gradoAsignado;
    }
    
    public void registrarAsistencia(LocalDate fecha, boolean asistio) {
        if (contAsistencias < asistencias.length) {
            asistencias[contAsistencias] = new Asistencia(fecha, asistio);
            contAsistencias++;
        } else {
            System.out.println("\nLimite de asistencias para " + nombre);
        }
    }
    
    public void mostrarAsistencia() {
        System.out.println("\nAsistencias de " + nombre + ":");
        for (int i = 0; i < contAsistencias; i++) {
            System.out.println("Fecha: " + asistencias[i].getFecha() + " - Asistio: " + (asistencias[i].getAsistio() ? "Si" : "No"));
        }
    }
    
    public void registrarNota(Evaluacion evaluacion) {
        if (contEvaluaciones < evaluaciones.length) {
            evaluaciones[contEvaluaciones] = evaluacion;
            contEvaluaciones++;
        } else {
            System.out.println("\nLimite de evaluaciones para " + nombre);
        }
    }
    
    public void mostrarNota() {
        System.out.println("\nEvaluaciones de " + nombre + ":");
        for (int i = 0; i < contEvaluaciones; i++) {
            Evaluacion eval = evaluaciones[i];
            System.out.println("Materia: " + eval.getMateria() + " // Nota: " + eval.getNota());
        }
    }
}
