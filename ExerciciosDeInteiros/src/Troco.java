import java.util.Scanner;
//Leia o valor da compra e o valor pago. Se o valor pago for menor, mostre “Valor insuficiente”; senão, mostre o troco com 2 casas decimais.
public class Troco {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valorCompra, valorPago;

        System.out.print("Valor total da compra é de R$ ");
        valorCompra = ler.nextDouble();

        System.out.print("Valor pago foi de R$ ");
        valorPago = ler.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente");
        }
        else {
            System.out.printf("Troco é de R$ %.2f.", (valorPago - valorCompra));
        }

        ler.close();

    }
}