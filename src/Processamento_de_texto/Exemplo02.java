package Processamento_de_texto;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int totalVogais = 0;
        char[] letra;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        letra = frase.toCharArray();

        for (int i=0; i < letra.length; i++) {
            System.out.print(letra[i] + "\n");
        }

        System.out.println();

        for (char c : letra) {
            System.out.print(letra[c] + "\n");
        }
    }
}
