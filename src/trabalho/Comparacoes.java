public class Comparacoes {
public static void main (String [] args) {

    int idade = 18;
    boolean maiorIdade = idade >= 18;
    boolean igualIdade = idade == 18;
    boolean diferenteIdade = idade != 18;

    System.out.println("Idade da pessoa: " + idade);
    System.out.println("Maior ou igual a 18 anos? " + maiorIdade);
    System.out.println("Tem 18 anos? " + igualIdade);
    System.out.println("Não tem exatamente 18 anos? " + diferenteIdade);

    long numeroGrande = 3000000000L;
    // 3000000000 não cabe em int, então o casting causa perda de informação e altera o valor.
    int intNumeroGrande = (int) numeroGrande;

    System.out.println("Variável long com número grande: " + numeroGrande);
    System.out.println("Variável int com número grande: " + intNumeroGrande);

}
}
