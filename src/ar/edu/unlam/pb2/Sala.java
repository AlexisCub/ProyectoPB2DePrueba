package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Sala extends Curso {

    private String nombre;
    private ArrayList<String> materias;
    private ArrayList<Docente> docentesSecundaria;
    private int nivelAcademico;

    public Sala(String nombre, int nivelAcademico) {
        super();
        this.nombre = nombre;
        this.nivelAcademico = nivelAcademico;
        this.materias = new ArrayList<String>();
        
        if (nivelAcademico >= 7) {
            docentesSecundaria = new ArrayList<Docente>(10);
        }
    }


    public void agregarDocenteSecundaria(Docente nuevoDocente){
        boolean tieneExperiencia = false;

        for (int i = 0; i < nuevoDocente.getGradoExperiencia().length; i++) {
        	
            if (nuevoDocente.getGradoExperiencia()[i] == nivelAcademico) {
            	
                tieneExperiencia = true;
                break;
            }
        }

        if (tieneExperiencia) {
            getDocentes().add(nuevoDocente);
            System.out.println("Docente " + nuevoDocente.getNombre() + " asignado a " + nombre);
        } else {
            System.out.println("El docente " + nuevoDocente.getNombre() + " no tiene experiencia en el año " + nivelAcademico);
        }
    }

    public void asignarDocentePorMateria(String materia, Docente docente) {
        if (nivelAcademico >= 7) {
            if (materias.size() < 10) {
                materias.add(materia);
                docentesSecundaria.add(docente);
                System.out.println("Docente " + docente.getNombre() + " asignado a la materia " + materia);
            } else {
                System.out.println("Capacidad máxima de materias alcanzada");
            }
        } else {
            System.out.println("Solo docentes secundaria");
        }
    }

    public void listaAlumnosOrdenados() {
        String[] nombresAlumnos = new String[getCantidadAlumnos()];

        for (int i = 0; i < getCantidadAlumnos(); i++) {
            nombresAlumnos[i] = getAlumnos().get(i).getApellido() + " " + getAlumnos().get(i).getNombre();
        }

        for (int i = 0; i < nombresAlumnos.length - 1; i++){
        	
            for (int j = 0; j < nombresAlumnos.length - 1 - i; j++){
            	
                if (nombresAlumnos[j].compareTo(nombresAlumnos[j + 1]) > 0) {
                	
                    String aux = nombresAlumnos[j];
                    nombresAlumnos[j] = nombresAlumnos[j + 1];
                    nombresAlumnos[j + 1] = aux;
                }
            }
        }

        System.out.println("Lista de alumnos en " + nombre + ":");
        for (int i = 0; i < nombresAlumnos.length; i++) {
        	
            System.out.println(nombresAlumnos[i]);
        }
    }

    public void listaAlumnosPorDNI() {
        for (int i = 0; i < getCantidadAlumnos() - 1; i++){
        	
            for (int j = 0; j < getCantidadAlumnos() - 1 - i; j++){
            	
                if (getAlumnos().get(j).getDni() > getAlumnos().get(j + 1).getDni()) {
                	
                    Alumno aux = getAlumnos().get(j);
                    getAlumnos().set(j, getAlumnos().get(j + 1));
                    getAlumnos().set(j + 1, aux);
                }
            }
        }

        System.out.println("Lista de " + this.nombre + " ordenada por DNI");
        for (Alumno alumno : getAlumnos()) {
        	
            System.out.println(alumno.getApellido() + " " + alumno.getNombre() + " - DNI: " + alumno.getDni());
        }
    }

    public Alumno buscarAlumnoPorDNI(int dni) throws AlumnoNoEncontradoException{
    	
        for (int i = 0; i < getAlumnos().size(); i++) {
        	
            if (getAlumnos().get(i).getDni() == dni) {
            	
                return getAlumnos().get(i);
            }
        }
        throw new AlumnoNoEncontradoException("Alumno con DNI " + dni + " no encontrado");
    }

    public String getNombre(){
    	
        return nombre;
    }

    public ArrayList<Docente> getDocentesSecundaria(){
    	
        return docentesSecundaria;
    }

    public ArrayList<String> getMaterias(){
    	
        return materias;
    }
}
