package ar.edu.unlam.pb2;

public class Persona {
    private String nombre;
    private Integer dni; 

    public Persona(String nombre, Integer dni) { 
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre; 
    }
    
    public Integer getDni() {
        return dni; 
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
