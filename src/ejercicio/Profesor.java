/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author leobusta
 */
public class Profesor extends Persona {
    private String especialidad;
    private String area;
    private String nivelAcademico;

    public Profesor(String especialidad, String area, String nivelAcademico, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.area = area;
        this.nivelAcademico = nivelAcademico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getArea() {
        return area;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    
}
