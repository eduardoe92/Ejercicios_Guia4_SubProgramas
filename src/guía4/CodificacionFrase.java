
package guía4;

import java.util.Scanner;

public class CodificacionFrase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        String fraseCodificada = codificarFrase(frase);
        System.out.println("La frase codificada es: " + fraseCodificada);
    }

    public static String codificarFrase(String frase) {
        String fraseCodificada = "";
        for (int i = 0; i < frase.length(); i++) {
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