import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao seu banco! Digite o número da conta:");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e o seu saldo R$ " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}