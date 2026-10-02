import java.util.Scanner;
//Leia também o preço unitário do produto. Se for preciso repor, mostre quantas unidades comprar para chegar ao mínimo e o custo da compra.
public class DesafioDoEstoque {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int quantAtual, quantMin, quantFaltante;
        double precoUnitario;

        System.out.print("Digite a quantidade atual de produtos em estoque: ");
        quantAtual = ler.nextInt();

        System.out.print("Digite a quantidade mínima necessária para o produto: ");
        quantMin = ler.nextInt();

        System.out.print("Digite o valor do preço unitário do produto: R$ ");
        precoUnitario = ler.nextDouble();

        quantFaltante = quantMin - quantAtual;

        if (quantAtual < quantMin) {
            System.out.println("Alerta: Necessário realizar reposição de estoque!");
            System.out.printf("Precisa comprar %d unidades para chegar ao mínimo necessário.\n", quantFaltante);
            System.out.printf("Custo da compra das unidades faltantes é de R$ %.2f.", (precoUnitario * quantFaltante));
        }
        else {
            System.out.println("Estoque Suficiente.");
        }

        ler.close();

    }
}