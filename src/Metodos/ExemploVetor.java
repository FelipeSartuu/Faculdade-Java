package Metodos;

import java.util.Random;

public class ExemploVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        preencher(vetor);
        imprimir(vetor);
        System.out.println("Soma dos elementos: " + somar(vetor));
        System.out.println("Média dos elementos: " + calcularMedia(vetor));
        System.out.println("Maior valor armazenado: " + maiorValor(vetor)); // Corrigido aqui
    }

    public static void preencher(int[] vetor) {
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(2, 10);
        }
    }

    public static void imprimir(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static int somar(int[] vetor) {
        int total = 0;

        for (int valor : vetor) {
            total += valor;
        }
        return total;
    }

    public static double calcularMedia(int[] vetor) {
        return (double) somar(vetor) / vetor.length;
    }

    public static int maiorValor(int[] vetor) {
        int maior = Integer.MIN_VALUE;
        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }
}
