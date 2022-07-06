/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triki;

/**
 *
 * @author leobusta
 */
public class Triki {
    private char[][] tablero;
    
    public Triki(){
        char [][] matriz = {{'a','a','a'},{'a','a','a'},{'a','a','a'}};
        this.tablero = matriz;
    }
    
    public void marcarCasilla(char simbolo, int fila, int columna){
        this.tablero[fila][columna] = simbolo;
    }
    
    public char verificarCasilla(int fila, int columna){
        return this.tablero[fila][columna];
    }
    
    public void mostrarTablero(){
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                System.out.print(this.tablero[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("----------------");
    }
}
