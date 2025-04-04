import java.util.ArrayList;
import java.util.Scanner;

public class App3 {

public static void main(String[] args) {
    
    System.out.println("Bem-Vindo ao sistema de contas bancárias!");
    Scanner scanner = new Scanner(System.in);

    ArrayList<Conta> contas = new ArrayList<>();
    boolean sair = true;
    int opcao;

    do { 
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Consultar Saldo");
        System.out.println("5 - Sair");
        opcao = scanner.nextInt(); // Atualiza a opção escolhida pelo usuário

        switch (opcao) {
            case 1 :
                System.out.println("Digite o nome do proprietário:");
                String nomeTitular = scanner.next();
                System.out.println("Digite o numero da conta do proprietário:");
                String numeroConta = scanner.next();
                Conta conta = new Conta(nomeTitular, numeroConta);
                contas.add(conta);
                System.out.println("Conta criada com sucesso!");
                break;
            case 2 :
                System.out.println("Digite o numeroConta da conta:");
                String numeroContaDeposito = scanner.next();
                System.out.println("Digite o valor a depositar:");
                double valorDeposito = scanner.nextDouble();
                for (Conta c : contas) {
                    if (c.getnumeroConta().equals(numeroContaDeposito)) {
                        c.depositar(valorDeposito);
                        break;
                    }
                }
                break;
            case 3 :
                System.out.println("Digite o numeroConta da conta:");
                String numeroContaSaque = scanner.next();
                System.out.println("Digite o valor a sacar:");
                double valorSaque = scanner.nextDouble();
                for (Conta c : contas) {
                    if (c.getnumeroConta().equals(numeroContaSaque)) {
                        c.sacar(valorSaque);
                        break;
                    }
                }
                break;
            case 4 :
                System.out.println("Digite o numeroConta da conta:");
                String numeroContaConsulta = scanner.next();
                for (Conta c : contas) {
                    if (c.getnumeroConta().equals(numeroContaConsulta)) {
                        System.out.println("Saldo: R$" + c.getSaldo());
                        break;
                    }
                }
                break;
            case 5 :
                System.out.println("Saindo...");
                sair = false;
                break;
            default : 
                System.out.println("Opção inválida.");
        }
        
    } while (sair == true);

    scanner.close();
    System.out.println("Sistema encerrado.");
    
}
    
}
