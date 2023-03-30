
/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
*/

package guía4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el número a evaluar");
        int numero=(int) leer.nextInt();
        evaluar(numero);
        
        if(evaluar(numero)){
            System.out.println("El número ingresado es un número primo");
        }else {
            System.out.println("El número ingresado no es un número primo");
        }
    }
    public static boolean evaluar(int numero) {
        
            if (numero <= 1) {
                return false;
            }   
            for (int i = 2; i <= numero/2; i++) { 
                if (numero % i==0){
                    return false;
                }
            }return true;
                
            }
    }