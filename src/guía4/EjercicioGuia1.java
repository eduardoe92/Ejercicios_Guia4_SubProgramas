/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.

a    e    i    o    u
@   #   $    %    *

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.

Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

*/

package guía4;

import java.util.Scanner;

public class EjercicioGuia1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase= leer.next();
        
        String fraseCodificada = codificarFrase(frase);
        
        //System.out.println("Frase original: " + frase);
        System.out.println("Frase codificada: " + fraseCodificada);    
    }
    
    public static String codificarFrase(String frase) {
         String fraseCodificada = "";
            for (int i = 0; i < frase.length(); i++){
              char letra = frase.charAt(i);
                switch (letra) {
                    case 'A':
                    case 'a':
                        fraseCodificada += "@";
                        break;
                    case 'E':
                    case 'e':
                        fraseCodificada += "#";
                        break;
                    case 'I':
                    case 'i':
                        fraseCodificada += "$";
                        break;
                    case 'O':
                    case 'o':
                        fraseCodificada += "%";
                        break;
                    case 'U':
                    case 'u':
                        fraseCodificada += "*";
                        break;
                    default:
                        fraseCodificada += letra;
                        break;
           }
        }        
        return fraseCodificada;
    }

}