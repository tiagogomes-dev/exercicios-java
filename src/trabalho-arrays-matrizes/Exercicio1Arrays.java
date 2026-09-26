public class Exercicio1Arrays {
    public static void main(String[] args) {
      double[] notas = { 3.5, 8.0, 1.2, 9.9, 4.4 };

      double maior = notas[0];
      double menor = notas[0];

      for (int i = 1; i < notas.length; i++) {
      if (notas[i] > maior) {
        maior = notas[i];
      }
      if (notas[i] < menor) {
        menor = notas[i];
      }
    }

      System.out.println("A maior nota é " + maior);
      System.out.println("A menor nota é " + menor);

    }
}