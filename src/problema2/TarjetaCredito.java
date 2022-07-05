/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;
import java.util.Date; 

/**
 *
 * @author leobusta
 */
public class TarjetaCredito {
    protected String numero; 
    protected Date vencimiento;
    protected int codigo; 
    protected String franquicia;
    protected Banco banco; 
    protected Cliente cliente;

    public TarjetaCredito(String numero, Date vencimiento, int codigo, String franquicia, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.vencimiento = vencimiento;
        this.codigo = codigo;
        this.franquicia = franquicia;
        this.banco = banco;
        this.cliente = cliente;
    }
    
    
}
