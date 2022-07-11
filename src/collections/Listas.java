/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author leobusta
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arraylist();
        hashmap();
    }

    public static void arraylist() {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        System.out.println(lista);

        lista.remove(3); // lista.remove((Integer)3) objeto elimina el elemento

        System.out.println(lista);

        for (Integer elem : lista) {
            System.out.print(elem + " ");
        }

        System.out.println("\nSize: " + lista.size() + "");

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }

    public static void vector() {

        // Vector para almacenar cualquier tipo
        Vector vector = new Vector();

        // agregar elementos de distinto tipo
        vector.add(1);
        vector.add(true);
        vector.add("Mision");
        vector.add("TIC");
        vector.add(2.0);

        System.out.println("Vector 1: " + vector);

        // modificar el valor de uno de los elementos
        vector.set(0, 2021);
        System.out.println("Vector 2: " + vector);
        // eliminar elemento en el ´ındice 4
        vector.remove(4);
        System.out.println("Vector 3: " + vector);

        // impresi´on de elementos con ciclo por elemento
        for (Object elemento : vector) {
            System.out.print(elemento + " ; ");
        }
    }

    public static void hashmap() {
       // HashMap con claves string y valores double
        HashMap<String, Double> mapa = new HashMap<>();
        
        // agregar elementos al HashMap
        mapa.put("nota1", 3.2);
        mapa.put("nota2", 4.3);
        mapa.put("nota3", 3.9);
        // cantidad de elementos en el HashMap
        System.out.println("Tamaño: " + mapa.size());
        // impresi´on del HashMap
        System.out.println("HashMap 1: " + mapa);
        
        Double valor1 = mapa.get("nota5");
        System.out.println("valor: "+valor1);

        // verificaci´on de llave y extracci´on de valor
        if (mapa.containsKey("nota2")) {
            Double valor = mapa.get("nota2");
            System.out.println("nota 2 === " + valor);
        }

        mapa.remove("nota1");
        
        System.out.println("HashMapFinal:");
        // recorrer HashMap por llave y clave
        for (Map.Entry<String, Double> elem: mapa.entrySet()) {
            System.out.println(elem.getKey() + " : " + elem.getValue());
        }
    }
}
