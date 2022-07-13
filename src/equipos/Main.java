/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipos;
import java.util.Arrays;
import java.util.ArrayList;
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
        
        Torneo mitorneo = new Torneo();
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] entradaArr = entrada.split(",");
        
        ArrayList<String> nuevalista = new ArrayList<>(Arrays.asList(entradaArr));
        
//        ArrayList<String> nuevalista = 
//                new  ArrayList<>(Arrays.asList("Newpi", "San Francis", "Naughty Boys", "Newpi", "Newpi", "Naughty Boys", "Newpi", "San Francis"));
//        
//        nuevalista.add("San Francis");
//        nuevalista.add("Club Hanawa");
//        nuevalista.add("Club Hanawa");
//        nuevalista.add("Club Hanawa");
//        nuevalista.add("Club Hanawa");
        
        System.out.println(mitorneo.equipos(nuevalista));
    }
    
}
