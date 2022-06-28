package javaapplication1;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author leobusta
 */
public class Matrices {
    
    public static int[][] lee_matriz_enteros(Scanner sc, int n, int m) {

        int[][] x = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese la componente " + i + ", "+j+": ");
                x[i][j] = sc.nextInt();
            }
        }

        return x;
    }    
    
    public static void imprimirMatriz(int[][] x) {

       
//        for (int i = 0; i < x.length; i++) {
//            for (int j=0; j< x[i].length; j++ ){
//                System.out.print(x[i][j]+" ");
//            }
//            System.out.println("");
//        }
        for (int[] x1 : x) {
            System.out.println(Arrays.toString(x1));
        }        
    }
    
    public static int[][] cuadrados_matriz(int[][] x){
        int[][] y = new int[x.length][x[0].length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                y[i][j] = (int) Math.pow(x[i][j],2);
            }
        }
        
        return y;
    }
    
    public static int[] diagonal_matriz(int[][] x){
        if (x.length != x[0].length){
            System.out.println("No es una matriz cuadrada");
            return null;
        }
        
        int[] y = new int[x.length];
        
        for(int i = 0;  i < x.length; i++){
            y[i] = x[i][i];
        }
        
        return y;
    
    }
    
    public static boolean matriz_simetrica(int[][] x){
        
        for(int i = 0;  i < x.length -1 ; i++){
           for (int j = i+1; j < x.length; j++ ){
               if (x[i][j] != x[j][i]){
                   return false;
               }
           }
        }
        
        return true;   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz  = lee_matriz_enteros(sc,3,3);
        
        imprimirMatriz(matriz);
        System.out.println("");
        //imprimirMatriz(cuadrados_matriz(matriz));
        //System.out.println(Arrays.toString(matriz[0]));
        
        //System.out.println(Arrays.toString(diagonal_matriz(matriz)));
        System.out.println(matriz_simetrica(matriz));
    }
    
}
