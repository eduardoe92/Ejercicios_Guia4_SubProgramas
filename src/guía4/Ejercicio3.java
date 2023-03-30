/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
*/

package guía4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de euros que desea convertir");
        double dinero=(double) leer.nextDouble();
        convertidor(dinero);
        
    }
    public static void convertidor(double dinero) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elige la moneda ");
        System.out.println("1.- Libras");
        System.out.println("2.- Dólares");
        System.out.println("3.- Yenes");
        int opcion=(int) leer.nextInt();
        
        switch(opcion){
            case 1:
                double libras;
                libras=(dinero*0.88);
                System.out.println("La cantidad ingresada en Libras sería: " +libras+ " £");
                break;
            case 2:
                double dolares;
                dolares=(dinero*1.073);
                System.out.println("La cantidad ingresada en Dólares sería: " +dolares+ " $");
                break;
            case 3:
                double yenes;
                yenes=(dinero*144.31);
                System.out.println("La cantidad ingresada en Yenes sería: " +yenes+ " ¥");
                break;
            default:
                System.out.println("Opción ingresada no válida");
        }
        
    }
}