public class BalancoTrimestral {
public static void main(String [] args) {

    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;

    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

    // Uso double e 3.0 para manter as casas decimais; com int e 3, o resultado seria truncado.
    double mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3.0;

    System.out.println("O total de gasto trimestral = R$ " + gastosTrimestre + " reais.");
    System.out.println("Valor da média mensal = R$ " + mediaMensal + " reais.");
}
}
