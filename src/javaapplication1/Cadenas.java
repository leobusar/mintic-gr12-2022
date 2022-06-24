/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Cadenas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* System.out.println("Ingrese la cadena:");
        String cadena = sc.nextLine();

        System.out.println("Ingrese la cadena:");
        
        String cadena4 = sc.nextLine();
*/
  /*      String a = "hola";
        String b = "hola";
        String c = "HOLA";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
*/
  
//        String a = "Hola Jorge"; 
//        String b = "hola"; 
//        
//        //System.out.println(a.toUpperCase().contains(b.toUpperCase()));
//        
//        //System.out.println("Colombia patria mia".length());
//        
//        System.out.println(a.charAt(5));
//        
//        String s = "Mi lenguaje favorito es Java";
//        //System.out.println(s.substring(10, s.length()));
//        String[] line = s.split(" ");
//        System.out.println(line[4]);
        
        String s = "Juan 30 1.68";
        String[] line = s.split(" ");
        
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura  = Double.parseDouble(line[2]);
        
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: "+ edad);
        System.out.println("estatura: "+ estatura+"m" );
    }

}