/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

/**
 *
 * @author leobusta
 */
public class Caja3 {

    protected Object obj;

    public Caja3(Object obj) {
        this.obj = obj;
    }

    public Object obtener() {
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
