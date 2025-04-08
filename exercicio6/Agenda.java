import java.util.Scanner;

public class Agenda {

    public static void exibirMenu(){

        do {
            
            System.out.println("Bem-Vindo à agenda");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Editar contato");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Pesquisar contato");
            System.out.println("6 - Sair");
            
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    adicionarContatos();
                    break;
                case 2:
                    // Remover contato
                    break;
                case 3:
                    // Listar contatos
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                case 5:
                    // Pesquisar contato
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while ( opcao != 5);
        
    }

    public static void adicionarContatos(Contato contato) {
        
    }

    public static void listarContatos(Contato contato) {
        
    }

    public static void editarContatos(Contato contato) {
        
    }

    public static void removerContatos(Contato contato) {
        
    }

    public static void pesquisarContatos(Contato contato) {
        
    }
    
}
