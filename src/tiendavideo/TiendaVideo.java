/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideo;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class TiendaVideo {
    private String nombre;
    private Producto[] productos;
    private int ultimo;
    
    public TiendaVideo(String nombre){
        this.nombre = nombre;
        this.productos = new Producto[100];
        this.ultimo = 0;
    }
    
    public void agregarProducto(Producto producto){
        this.productos[ultimo] = producto;
        this.ultimo++;
    }
    
    public void agregarPelicula(Pelicula pelicula){
        this.productos[ultimo] = pelicula;
        this.ultimo++;
    }

    public void agregarJuego(Juego juego){
        this.productos[ultimo] = juego;
        this.ultimo++;
    }    
    
    public void inventario(){
        for(int i =0; i < ultimo; i++){
            System.out.println(this.productos[i]);
            System.out.println("--------------");
        }
    }
    
    /****
     * 1&nombre&precio&codigo
     *      -- 1&Pelicula&nombre&precio&codigo&duracion
     *      -- 1&Juego&nombre&precio&codigo&tipo
     * 2
     * 3
     * 
     */
    
    public int procesarComando(String comando){
        String[] comandoArr = comando.split("&");
        int opcion = Integer.parseInt(comandoArr[0]);
        switch(opcion){
            case 1:
                String tipo = comandoArr[1];
                String nombre = comandoArr[2];
                String codigo = comandoArr[4];
                Double precio = Double.parseDouble(comandoArr[3]);
                
                if(tipo.equals("Pelicula")){
                    Double duracion = Double.parseDouble(comandoArr[5]);
                    Pelicula pelicula = new Pelicula(duracion, nombre, precio, codigo);
                    
                    agregarPelicula(pelicula);
                }else{
                    String tipoJuego = comandoArr[5];
                    Juego juego  = new Juego(tipoJuego, nombre, precio, codigo);
                    agregarJuego(juego);
                }
                
                //Producto producto = new Producto(nombre, precio, codigo);
                //this.agregarProducto(producto);
                
                break;
            case 2:
                inventario();
                break;
            case 3:
                //System.exit(0);
                break;        
        }
        return opcion;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TiendaVideo tienda = new TiendaVideo("Blockbooster");
        int opc; 
        do {
            String linea = sc.nextLine();
            opc = tienda.procesarComando(linea);
        } while(opc != 3);
    }    
}
