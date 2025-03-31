public class Main{

    public static void main (String[] args) {
        
        
        System.out.println("Bem-Vindo ao seu Banco");
        System.out.println("Digite a opção que deseja utilizar:");

        System.out.println("1 - Criar Conta");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Consultar Saldo");
        System.out.println("5 - Sair"); 

        ArrayList<Conta> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o número
        Conta conta = null;

        scanner.close();
        System.out.println("Obrigado!");
    }
}