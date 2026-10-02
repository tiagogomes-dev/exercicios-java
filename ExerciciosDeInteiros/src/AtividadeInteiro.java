import java.util.Scanner;
//Programa que auxilia no controle de estoque de uma loja.
public class AtividadeInteiro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int quantAtual, quantMin;

        System.out.print("Digite a quantidade atual de produtos em estoque: ");
        quantAtual = ler.nextInt();

        System.out.print("Digite a quantidade mínima necessária para o produto: ");
        quantMin = ler.nextInt();

        if (quantAtual < quantMin) {
            System.out.println("Alerta: Necessário realizar reposição de estoque!");
        }
        else {
            System.out.println("Estoque Suficiente.");
        }

        ler.close();

    }
}
