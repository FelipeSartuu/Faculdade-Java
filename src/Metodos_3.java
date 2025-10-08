import java.util.Scanner;

public class Metodos_3 {
    public static void main(String[] args) {
        int[] x = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {
            System.out.print("Valor " + i + ": ");
            x[i] = sc.nextInt();
        }

        int maiorvalor = maiorValor(x);
        System.out.println("O maior valor é " + maiorvalor);
    }

    public static int maiorValor(int[] x) {
        int maior = x[0];

        for (int i = 1; i < x.length; i++) {
            if (x[i] > maior) {
                maior = x[i];
            }
        }

        return maior;
    }
}
