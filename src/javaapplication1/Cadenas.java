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
        //String s = "Juan 30 1.68";
//        System.out.println("Ingrese los datos separados por punto y coma';' ");
//        String s = sc.nextLine();
//        String[] line = s.split(";");
//
//        String nombre = line[0];
//        int edad = Integer.parseInt(line[1].trim());
//        double estatura = Double.parseDouble(line[2].trim());
//
//        System.out.println("nombre: " + nombre);
//        System.out.println("edad: " + edad);
//        System.out.println("estatura: " + estatura + "m");

        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %10.2f", 32.33434);//returns 12 char fractional part

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }

}
