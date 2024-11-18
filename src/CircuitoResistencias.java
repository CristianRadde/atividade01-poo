import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];
        double resistenciaEquivalente = 0, maior = 0, menor = Double.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = scanner.nextDouble();
            resistenciaEquivalente += resistencias[i];
            maior = Math.max(maior, resistencias[i]);
            menor = Math.min(menor, resistencias[i]);
        }

        System.out.println("Resistência Equivalente: " + resistenciaEquivalente + " Ω");
        System.out.println("Maior Resistência: " + maior + " Ω");
        System.out.println("Menor Resistência: " + menor + " Ω");

        scanner.close();
    }
}
