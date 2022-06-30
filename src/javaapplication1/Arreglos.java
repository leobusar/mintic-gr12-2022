package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Arreglos {
    
    public static int[] lee_arreglo_enteros(Scanner sc, int n) {

        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la componente " + i + ": ");
            x[i] = sc.nextInt();
        }

        return x;
    }

    public static void imprimirArreglo(int[] x) {

        int n = x.length;
        
        for (int i = 0; i < n; i++) {
            System.out.print(x[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = lee_arreglo_enteros(sc,4);
        
        //System.out.println(arreglo);
        
        imprimirArreglo(arreglo);
    }
}
