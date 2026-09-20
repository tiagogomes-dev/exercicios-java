public class Exercicio1 {
public static void main(String [] args) {
    System.out.println("Classificando Identificadores como VÁLIDO ou INVÁLIDO.");
    System.out.println("valorTotal = VÁLIDO.");
    System.out.println("2semestre = INVÁLIDO, pois não pode começar com número.");
    System.out.println("nota_final = VÁLIDO, pois foi usado '_' que é válido para separar e não espaço que é inválido.");
    System.out.println("int = INVÁLIDO, pois é uma palavra reservada do Java.");
    System.out.println("$preco = VÁLIDO, pois é um dos simbolos permitidos para iniciar um identificador.");
    System.out.println("nome aluno = INVÁLIDO, pois foi utilizado espaço que não pode.");
}
}