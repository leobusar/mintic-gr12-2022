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
        if (fila >=3 || columna >= 3 || this.tablero[fila][columna] != 'a')
            return;
            //throw new RuntimeException("Valor fuera de rango");
        
        this.tablero[fila][columna] = simbolo;
    }
    
    public char verificarCasilla(int fila, int columna){
        if (fila >=3 || columna > 3)
            return 'a';
        return this.tablero[fila][columna];
    }
    
    public char verificarGanador(){
       for(int i =0; i<3; i++){
           if( tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2] && tablero[i][0]!='a'){
               return tablero[i][0];
           }
           if( tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i] && tablero[i][0]!='a'){
               return tablero[0][i];
           }           
       }
       if(tablero[1][1]==tablero[2][2] && tablero[1][1]==tablero[0][0] && tablero[1][1]!='a')
           return tablero[1][1];
       
       if(tablero[1][1]==tablero[0][2] && tablero[1][1]==tablero[2][0] && tablero[1][1]!='a')
           return tablero[1][1];       
       
       return 'a';
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
