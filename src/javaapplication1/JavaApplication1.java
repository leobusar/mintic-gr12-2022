
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    
    
    public static double cuadrado(double num) {
        return num * num;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número: ");
        //double numero = sc.nextDouble();
        double numero = Double.parseDouble(sc.nextLine());
       
        System.out.println("El cuadrado de "+ numero + " es: "+ Math.pow(numero,2));
        
    }
    
}
