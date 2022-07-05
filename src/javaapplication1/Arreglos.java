package javaapplication1;

import java.util.Scanner;
import java.util.Arrays;

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
    
    public static int productoPunto(int[] v, int[] w){
        int n = v.length;
        int m = w.length;
        int prod = 0;
        
        if (n != m){
            return 0;
            //throw new RuntimeException("Los arreglos deben ser del mismo tamaño");
        }
        
        for (int i = 0; i < n; i++) {
            prod += v[i] * w[i];
        }
    
        return prod;
    }
    
    public static int[] productoDirecto(int[] v, int[] w){
        int n = v.length;
        int m = w.length;
        int[] prod = new int[n];
        
        if (n != m){
            return null;
            //throw new RuntimeException("Los arreglos deben ser del mismo tamaño");
        }
        
        for (int i = 0; i < n; i++) {
            prod[i] = v[i] * w[i];
        }
    
        return prod;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = lee_arreglo_enteros(sc,3);
        
        int[] arreglo2 = lee_arreglo_enteros(sc,3);
        
        //System.out.println(arreglo);
        
        //imprimirArreglo(arreglo);
        
        System.out.println(Arrays.toString(arreglo));
        System.out.println(Arrays.toString(arreglo2));
        
        System.out.println("El producto punto es: "+ productoPunto(arreglo,arreglo2));
        System.out.println("El producto directo es: "+ Arrays.toString(productoDirecto(arreglo,arreglo2)));
        
    }
    
    
}
