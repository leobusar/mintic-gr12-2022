package clases;

/**
 *
 * @author leobusta
 */
public class Perro {

    // atributos
    public String nombre;
    public String colorOjos;
    public String raza;
    public int edad;

    //constructor
    public Perro() {
        this.nombre="";
        this.edad = 0;
    }

    public Perro(String nombre, String colorOjos, int edad) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.edad = edad;
    }

    //métodos
    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    
    public void quienEsMayor(Perro otroPerro){
        if (this.edad == otroPerro.edad){
            System.out.println("Tenemos la misma edad");
        }else if (this.edad < otroPerro.edad){
            System.out.println(otroPerro.nombre+" es mayor");
        } else {
            System.out.println("Yo soy mayor que "+ otroPerro.nombre);
        }
    }

    public void saludarOtroPerro(Perro otroPerro){
        System.out.println("Hola "+otroPerro.nombre+", me llamo "+this.nombre);
    }
}
