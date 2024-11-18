
import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = scanner.next();

        System.out.print("Digite seus anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        boolean podeAposentar = (sexo.equalsIgnoreCase("M") && idade >= 65 && anosContribuicao >= 35) ||
                (sexo.equalsIgnoreCase("F") && idade >= 60 && anosContribuicao >= 30);

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar!");
        } else {
            int anosFaltantes = sexo.equalsIgnoreCase("M") ?
                    Math.max(65 - idade, 35 - anosContribuicao) :
                    Math.max(60 - idade, 30 - anosContribuicao);
            System.out.println("Faltam " + anosFaltantes + " anos para você se aposentar.");
        }

        scanner.close();
    }
}
