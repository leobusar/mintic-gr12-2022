/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import clases.*;
import java.util.Scanner;
/**
 *
 * @author leobusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("maya", "cafe", 10);
        
        perro1.ladrar();
        perro1.saludar();

        Perro perro2 = new Perro("toby", "azul", 8);
        perro2.saludar();
        
        System.out.println(perro2.colorOjos);
//        perro2.nombre = "bruno";
        
        perro2.saludar();
        
        perro1.quienEsMayor(perro2);
        perro2.saludarOtroPerro(perro1);
        
    }
    
}
