package Processamento_de_texto;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int x;

        System.out.print("Palavra: ");
        s1 = sc.next();

        sc.nextLine();

        System.out.print("Frase: ");
        s2 = sc.nextLine();

        System.out.print("Valor: ");
        x = sc.nextInt();

        System.out.println(s1 + "\n" + s2 + "\n" + x);
    }
}
