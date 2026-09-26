public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {
            { 8, 3, 14, 6 },
            { 11, 7, 2, 15 },
            { 4, 13, 9, 1 },
            { 16, 5, 12, 10 }
        };

        System.out.println("A diagonal secundária é: ");

        for (int i = 0; i < matriz.length; i++) {
            int ultimaColuna = (matriz[i].length) - 1;
            System.out.printf("{ %d }\n", matriz[i][ultimaColuna - i]);
        }
    }
}
