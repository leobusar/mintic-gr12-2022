/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrones;

/**
 *
 * @author leobusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*        Caja2 caja = new Caja2();
        String s = caja.decorar(false);
        System.out.println(s);

        Caja3 caja = new Caja3("Pepito");
        String s = caja.decorar();
        System.out.println(s);
        
        System.out.println(( (String) caja.obtener() ).length());
         */
        Caja4<String> caja = new Caja4<>("Pepito");
        String s = caja.decorar();
        System.out.println(s);

        System.out.println(caja.obtener().length());

        Caja4<Double> caja2 = new Caja4<>(20.34);
        System.out.println(caja2.decorar());
        double y = caja2.obtener() + 20.0;
        System.out.println(y);
    }

}
