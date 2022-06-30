/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;
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
        perro2.nombre = "bruno";
        
        perro2.saludar();
        perro2.saludar(4);
        perro2.saludar("Margarita");
        
        perro1.quienEsMayor(perro2);
        perro2.saludarOtroPerro(perro1);
        
        Scanner sc = new Scanner(System.in);
        
       /* System.out.print("Digite su nombre: ");
        String nomb = sc.nextLine();
        System.out.print("Digite la edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Digite el género (H/M): ");
        char genero = sc.nextLine().charAt(0);
        System.out.print("Digite el peso(Kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite la estatura(m): ");
        double estatura = sc.nextDouble();

        Persona person1 = new Persona(nomb, edad, genero,peso,estatura);
        
        if (person1.esMayorEdad()){
            System.out.println(person1.nombre+" es mayor de edad");
        }else{
            System.out.println(person1.nombre+" es menor de edad");
        }
        System.out.println(String.format("IMC: %.2f",person1.calcularIMC()));
        */
    }
    
}
