public class Aquecimento {
    public static void main(String[] args) {
        int[] valores = { 5, 12, 8, 20, 3 };

        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
            System.out.println("Valores do vetor " + i + ": " + valores[i]);
        }

        System.out.println("Resultado da soma é " + soma);
    }
}
