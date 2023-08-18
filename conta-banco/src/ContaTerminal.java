import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta:");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência:");
        String numeroDaAgencia = scanner.next();

        System.out.println("Por favor, digite o seu nome:");
        String nomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá," + nomeDoCliente +
                "! Obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroDaAgencia + ", o número da sua conta é "
                + numeroDaConta + " e seu saldo de "
                + saldo + " reais já está disponível para saque.");
    }
}