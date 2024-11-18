import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double porcentagemITBI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:"));

        double maiorValor = Math.max(valorTransacao, valorVenal);
        double imposto = maiorValor * (porcentagemITBI / 100);

        JOptionPane.showMessageDialog(null, "Imposto ITBI a ser pago: R$ " + imposto);
    }
}


