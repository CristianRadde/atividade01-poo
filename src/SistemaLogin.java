import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        boolean acessoConcedido = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                System.out.println("Acesso concedido.");
                acessoConcedido = true;
                break;
            } else {
                System.out.println("Login ou senha incorretos. Tentativa " + i + " de 3.");
            }
        }

        if (!acessoConcedido) {
            System.out.println("Acesso bloqueado após 3 tentativas.");
        }

        scanner.close();
    }
}
