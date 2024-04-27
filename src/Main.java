import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(sc.next());
        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(sc.nextInt());
        System.out.println("Por favor, digite o nome do cliente !");
        conta.setNomeCliente(sc.next());
        System.out.println("Por favor, digite o Saldo !");
        conta.setSaldo(sc.nextDouble());


        System.out.println(conta.toString());

    }
}