import java.util.Scanner;
//Leia dois inteiros e mostre a soma, a subtração, a multiplicação, a divisão inteira e o resto da divisão.
public class Calculadora {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o valor do primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        num2 = ler.nextInt();

        System.out.println("Soma: " + (num1 + num2));

        System.out.println("Subtração: " + (num1 - num2));

        System.out.println("Multiplicação: " + (num1 * num2));

        System.out.println("Divisão Inteira: " + (num1 / num2));

        System.out.println("Resto da divisão: " + (num1 % num2));

        ler.close();
    }
}