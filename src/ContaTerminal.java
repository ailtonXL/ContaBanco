import java.util.*;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO AJPLAY'S");
       //Recebe o nome
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        //Recebe a agência
        System.out.println("Digite o número a agência: ");
        String agencia = teclado.nextLine();
        teclado.nextLine();
        //Recebe o número da conta
        System.out.println("Digite o número da conta: ");
        int NumeroConta = teclado.nextInt();
        //Recebe o saldo
        System.out.println("Digite o saldo da conta:");
        double saldo = teclado.nextDouble();
        //exibe a mensagem
        System.out.println("Olá "+nome+ " obrigado por criar uma conta em nosso banco, sua agência é:  "+agencia+" conta: " +NumeroConta+ " e seu saldo: " + saldo +" já está disponível para saque");

    }
}