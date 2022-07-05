/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author leobusta
 */
public class Persona {
    protected String nombres; 
    protected String apellidos;
    protected String genero;
    protected int edad;
    protected Direccion direccion;

    public Persona(String nombres, String apellidos, String genero, int edad, Direccion direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
}
