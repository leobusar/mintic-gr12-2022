/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author leobusta
 */
public class Cliente {
    protected String nombre;
    protected String apellido; 
    protected Banco[] bancos;
    protected TarjetaCredito[] tarjetasCredito;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
