/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

/**
 *
 * @author leobusta
 */
public class Caja4<T> {
    protected T obj;
    
    public Caja4(T obj) {
        this.obj = obj;
    }

    public T obtener() {
        return obj;
    }

    public String decorar() {
        String s = this.obj.toString();
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }    
}
