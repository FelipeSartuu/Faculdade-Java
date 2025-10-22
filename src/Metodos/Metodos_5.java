package Metodos;

import java.util.Random;

public class Metodos_5 {
    public static void main(String[] args) {
        int[] vetor;

        vetor = preencherValores();
        imprimirValores(vetor);

        vetor = inverter(vetor);
        imprimirValores(vetor);
    }

    public static int[] preencherValores() {
        int[] vetor = new int[10];
        Random rd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(0, 50);
        }

        return vetor;
    }

    public static void imprimirValores(int[] vetor) {
        for (int i: vetor) {
            System.out.print(i + " , ");
        }
        System.out.println();
    }

    public static int[] inverter(int[] vetor) {

        int aux;

        for (int i= 0; i < vetor.length / 2; i ++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        return vetor;
    }
}
