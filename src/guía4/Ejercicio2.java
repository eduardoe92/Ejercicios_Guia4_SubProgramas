/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
*/

package guía4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        personas();
    }
    
public static void personas(){
            Scanner leer = new Scanner(System.in);
            int edad;
            String nombres, respuesta;
            boolean resp;
            resp=true;                       
            do {
                System.out.println("Ingrese el nombre");
                nombres=leer.next();
                System.out.println("Ingrese la edad");
                edad=leer.nextInt();
                
                if (edad>=18){
                    System.out.println(nombres+ " tiene actualmente " +edad+ " y es mayor de edad");
                }else
                    System.out.println(nombres+ " tiene actualmente " +edad+ " y es menor de edad");
                
                System.out.println("¿Desea continuar ingresando datos? (S/N)");
                respuesta=leer.next();
                resp=respuesta.equalsIgnoreCase("S");
                
            }while (resp);
     }
}