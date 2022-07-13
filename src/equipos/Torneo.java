/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos;
import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class Torneo {
    public ArrayList<String> equipos(ArrayList<String> interesantes){
        ArrayList<String> lista = new ArrayList<>();
        
        for (String elem:interesantes){
            if(!lista.contains(elem)){
                lista.add(elem);
            }
        }

        return lista;
    }
}
