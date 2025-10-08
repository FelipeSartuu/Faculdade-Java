import java.util.Scanner;

public class Metodos_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor1, valor2, valor3;

        System.out.println("Digite o valor 1: ");
        valor1 = sc.nextDouble();
        System.out.println("Digite o valor 2: ");
        valor2 = sc.nextDouble();
        System.out.println("Digite o valor 3: ");
        valor3 = sc.nextDouble();

        if(validar(valor1, valor2, valor3)) {
            classificar(valor1, valor2, valor3);
        } else {
            System.out.println("Não é um triângulo");
        }
    }

    public static boolean validar(double l1, double l2, double l3) {
        return (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2);
    }

    public static void classificar(double l1, double l2, double l3) {
        if (l1 == l2 && l2 == l3) {
            System.out.println("Triângulo equilátero");
        }
        else if(l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Triangulo isosceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }
    }
}
