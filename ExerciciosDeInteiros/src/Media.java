import java.util.Scanner;
//Programa para ler duas notas (double) e mostrar média com 2 casas decimais.
public class Media {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f", media);

        ler.close();

    }
}