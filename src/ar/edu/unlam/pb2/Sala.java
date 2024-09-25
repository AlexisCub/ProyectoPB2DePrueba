package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Sala {

    private String nombre;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente> docentes;  
    private ArrayList<String> materias;    
    private ArrayList<Docente> docentesSecundaria; 
    private int nivelAcademico;

    public Sala(String nombre, int nivelAcademico) {
        this.nombre = nombre;
        alumnos = new ArrayList<Alumno>(); 
        this.nivelAcademico = nivelAcademico;

        if (nivelAcademico == 0) {
            docentes = new ArrayList<Docente>(2);
        } else if (nivelAcademico >= 1 && nivelAcademico <= 6) {
            docentes = new ArrayList<Docente>(1);
        } else if (nivelAcademico >= 7) {
            materias = new ArrayList<String>(10);
            docentesSecundaria = new ArrayList<Docente>(10);
        }
    }

    public void agregarAlumno(Alumno nuevoAlumno) {
        alumnos.add(nuevoAlumno);
        System.out.println("Alumno " + nuevoAlumno.getNombre() + " agregado a " + nombre);
    }

    public void agregarDocente(Docente nuevoDocente) {
        if (nivelAcademico == 0) {
            if (docentes.size() < 2) { 
                docentes.add(nuevoDocente);
                System.out.println("Docente " + nuevoDocente.getNombre() + " asignado a " + nombre);
            } 
            else {
                System.out.println("Ya hay dos docentes asignados a esta sala de Jardín: " + nombre);
            }
        } 
        else {
            if (nivelAcademico >= 1 && nivelAcademico <= 6) {
                if (docentes.size() < 1) { 
                    docentes.add(nuevoDocente);
                    System.out.println("Docente " + nuevoDocente.getNombre() + " asignado a " + nombre);
                } 
                else {
                    System.out.println("Ya hay un docente asignado a esta sala de Primaria: " + nombre);
                }
            } 
            else {
                System.out.println("No se pueden agregar docentes en este nivel académico");
            }
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

    public void mostrarAlumnos() {
        System.out.println(nombre + " tiene " + alumnos.size() + " alumnos");
    }

    public int getCantidadAlumnos() {
        return alumnos.size();
    }

    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public ArrayList<Docente> getDocentesSecundaria() {
        return docentesSecundaria;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }
} 
