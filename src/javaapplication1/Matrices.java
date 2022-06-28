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
            for (int j = 0; j < n; j++) {
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz  = lee_matriz_enteros(sc,3,3);
        
        imprimirMatriz(matriz);
        
        
        
    }
    
}
