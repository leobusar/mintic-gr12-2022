
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Ciclos {
    
    public static void imprimirNumeros(){
        int i = 0; 
        while (i <= 6) {
            System.out.println(i);
            i = i + 1;
        }
    }
    
    public static void misterio(){
        int i = 2;
        int j = 25;
        while (i < j){
            System.out.println(i+" "+j);
            i = i * 2;
            j = j + 10;
        }
        
        System.out.println("the end.");
        System.out.println(i+" "+j);
    }
    
    public static double minMaquina(){
        double Xo = 1.0;
        double Xi = 1/2.0;
        do {
            Xo = Xi;
            Xi = Xo/2.0;
        } while(Xi > 0.0);
        
        return Xo;
    }

    public static int menu() {
        
        int opcion;
        Scanner sc  = new Scanner(System.in);
    
        do {
            System.out.println("Menu");
            System.out.println("1. Crear usuario");
            System.out.println("2. Editar usuario");
            System.out.println("3. Buscar usuario");
            opcion = sc.nextInt();
        
        } while( opcion <= 0 || opcion>3 );
    
        return opcion;
    }
    
    public static void login() {
    
        int opcion, intentos=0;
        
        Scanner sc  = new Scanner(System.in);
        
    
        do {
            System.out.println("Ingrese la contraseña:");
            opcion = sc.nextInt();
            if (opcion == 1234){
                System.out.println("Autorizado");
                break;
            }
            
            intentos++;
        
        } while( intentos < 3 );
    
    }
    
    public static int suma(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }
    
    public static void main(String [] args){
        //Scanner sc  = new Scanner(System.in);
        
        //System.out.println("Digite la vocal:");  
        //imprimirNumeros();
        //misterio();
        //System.out.println( minMaquina() );
        //System.out.println(menu());
        //login();
        
        //System.out.println(suma(5));
//        for (int i = 1; i <= 50; i*=2) {
//            System.out.print(i+" ");
//        }

          String[] frutas = new String[]{"Tomate de arbol", "Maracuya", "Guayaba", "Lulo", "Granadilla"};
          
          for(String f:frutas){
              System.out.println(f);
              if (f.equals("Lulo"))
                  break;
          }
        
    }
}
