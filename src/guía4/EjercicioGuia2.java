/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
*/

package guía4;

import java.util.Scanner;

public class EjercicioGuia2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números a validar");
        int num1= (int) leer.nextInt();
        int num2= (int) leer.nextInt();
        esMultiplo(num1, num2);                         
    }
        public static void esMultiplo(int num1, int num2) {
        
            if (num1 % num2 == 0)
                System.out.println("El primer número es multiplo del segundo");
            else System.out.println("El primer número no es multiplo del segundo");
        }
}