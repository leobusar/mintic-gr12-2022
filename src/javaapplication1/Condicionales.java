/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Condicionales {
    
    public static double valorAbsoluto(double num){

       /* double ret;
        if (num >= 0) {
            ret = num;
        } else {
            ret = -num;
        }
        return ret;*/
       
        if (num >= 0) {
            return num;
        } else {
            return -num;
        }
    }
    
    public static double valorAbsoluto2(double num){
    
        return (num >= 0)? num : -num;
    }
    
    public static void imprimirNumero(int num){
        if (num > 0) {
            System.out.print("+");
        }
        System.out.println(num);
    }
    
    public static double valorTotal(int n, double precio){
        if (n <= 5){
            return precio * n;
        } else if (n <= 10 ){
            return precio * n * 0.95;
        } else if (n <= 20 ){
            return precio * n * 0.9;
        } else {
            return precio * n * 0.8;
        }
    }
    
    public static boolean esVocal(char vocal){
        boolean ret;
        
        switch (vocal) {
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                ret = true;
                break;
            default: 
                ret = false;
                break;
        }
        
     
        return ret;
        
    }
    
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Digite la vocal:");
        //int numero = sc.nextInt();
        //imprimirNumero(numero);
        char ch = sc.nextLine().charAt(0);
        
        System.out.println(esVocal(ch));
        
        //double numero = sc.nextDouble();
        
        //System.out.println(valorAbsoluto2(numero));
    }

}
