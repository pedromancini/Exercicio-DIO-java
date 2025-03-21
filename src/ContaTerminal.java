import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Seja bem-vindo(a) ao Banco-Central!");

        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe a sua conta [1234]: ");
        conta = scanner.nextInt();

        System.out.println("Informe a sua agencia [012-3]: ");
        agencia = scanner.nextLine();
        agencia = scanner.nextLine();

        System.out.println("Informe a sua saldo: [12345.3]");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é : " + conta +
                ", e seu saldo: " + saldo + " já está disponível para realizar saque!");

    }
}