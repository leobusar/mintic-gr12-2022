/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triki;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Main {
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triki juego = new Triki();
        Scanner sc = new Scanner(System.in);
        
        do{ 
            clearScreen();
            juego.mostrarTablero();
            System.out.println("Ingresa tu jugada Ej: X,1,1 ");
            String jugada = sc.nextLine();
            String[] jugadaArr = jugada.split(",");
            if(jugadaArr.length==3){
                char simbolo = jugadaArr[0].charAt(0);
                int fila = Integer.parseInt(jugadaArr[1]);
                int columna = Integer.parseInt(jugadaArr[2]);

                juego.marcarCasilla(simbolo, fila, columna);
                //juego.mostrarTablero();
            }else{
                System.out.println("Jugada no válida");
            }
        } while(juego.verificarGanador() == 'a');
        
        System.out.println("El ganador es: " + juego.verificarGanador());
        // validar que no escriban por fuera del tablero.
        // validar que no sobreescriban una posición
        // validar que jugadaArr tenga 3 elementos
        // verificarGanador 
        // jugar.
    }
    
}
