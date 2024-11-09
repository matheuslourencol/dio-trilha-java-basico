import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta! ");
        numeroConta = teclado.nextInt();
        System.out.println("Porf favor, difite a Agência! ");
        agencia = teclado.next();
        System.out.println("Por favor, digite seu Nome! ");
        nomeCliente = teclado.next();
        System.out.println("Por favor, digite o valor do primeiro deposito! ");
        saldo = teclado.nextDouble();
        
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível para saque");




    }
}
