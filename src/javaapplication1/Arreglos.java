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
    
    public static int minimo(int[] arr, int inicio){
        int min = arr[inicio];
        int pos = inicio;
        
        for(int i= inicio; i < arr.length; i++){
            if (arr[i] < min ){
                min = arr[i]; // Ahora el número mínimo es arr[i] pues es menor que el mínimo que llevaba.
                pos = i;
            }
        }
    
        return pos; // Devuelve la posición del mínimo
    }
    
    
    /* Vamos a utilizar selection sort para ordenar, esto es dividir la lista en dos:
        una lista ordenada y otra desordenada.
    */
    public static void ordenar(int[] arr){
        
        for(int i= 0; i < arr.length-1; i++){
            int posmin = minimo(arr, i);
            if (posmin != i){
                int temp;
                temp = arr[i];
                arr[i] = arr[posmin];
                arr[posmin] = temp;      
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        int[] arreglo = lee_arreglo_enteros(sc,3);
//        
//        int[] arreglo2 = lee_arreglo_enteros(sc,3);
//        
//        //System.out.println(arreglo);
//        
//        //imprimirArreglo(arreglo);
//        
//        System.out.println(Arrays.toString(arreglo));
//        System.out.println(Arrays.toString(arreglo2));
//        
//        System.out.println("El producto punto es: "+ productoPunto(arreglo,arreglo2));
//        System.out.println("El producto directo es: "+ Arrays.toString(productoDirecto(arreglo,arreglo2)));

        //Encontrar el mínimo en un arreglo.
        
        int[] v = {4,1,2,5,6,4,3,1,0}; // [0,1,1,2,3,4,4,5,6] - 0 
        
        /*
         inicio = 0 . {0,1,2,5,6,4,3,1,4};
         1. {0,1,2,5,6,4,3,1,4};
         2. 
        
        */
        
        System.out.println(minimo(v,0));
        
        ordenar(v);
        System.out.println(Arrays.toString(v));
        
/*        int temp;
        
        temp = v[0];
        v[0] = v[1];
        v[1] = temp;
        
        System.out.println(Arrays.toString(v));
*/        
               
    }
    
    
}
