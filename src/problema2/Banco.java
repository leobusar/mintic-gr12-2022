/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author leobusta
 */
public class Banco extends Empresa {
    protected double capital;
    protected Cliente[] clientes;
    protected TarjetaCredito[] tarjetasCredito;

    public Banco(double capital, String nombre, String nit, String direccion) {
        super(nombre, nit, direccion);
        this.capital = capital;
        this.clientes = new Cliente[100];
        this.tarjetasCredito = new TarjetaCredito[100];
    }
    
    
}
