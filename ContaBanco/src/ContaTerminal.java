import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        numero = input.nextInt();
        String pass = input.nextLine();
        System.out.println("Agora digite sua agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o nome do usuário: ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o valor do saldo: ");
        saldo = input.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numero, saldo));




    }
}