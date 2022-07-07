/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideo;

/**
 *
 * @author leobusta
 */
public class Juego extends Producto{
    public String tipo;

    public Juego(String tipo, String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
        this.tipo = tipo;
    }


    @Override
    public String toString(){
        String output = "Tipo: Pelicula\n";
        output += super.toString();
        output += "\nTipo Juego: "+tipo;
        
        return output;
    }
    
}
