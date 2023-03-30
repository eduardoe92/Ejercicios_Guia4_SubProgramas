/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
*/

package guía4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números para realizar una operación");
        int num1=(int) leer.nextInt();
        int num2=(int) leer.nextInt();
        
       double retorno= operacion(num1,num2);
       
       System.out.println("El resultado de la operación es: " +retorno);
       
    }
    
    public static double operacion(int num1, int num2) {
        Scanner leer = new Scanner(System.in);
       double suma, resta, multi, divi;
        
        System.out.println("Elige la operación deseas realizar:");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        int opcion = leer.nextInt();
        
           switch (opcion){
               case 1:
                   suma=num1+num2;
                   return suma;
              case 2:
                   resta=num1-num2;
                   return resta;
               case 3:
                   multi=num1*num2;
                   return multi;
               case 4:
                   divi=num1/num2;
                   return divi;
               default:
                   System.out.println("Opción no válida");
           }
        return(opcion);
    }
}