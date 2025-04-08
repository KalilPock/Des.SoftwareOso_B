import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    // Lista de contatos como atributo da classe
    private static ArrayList<Contato> contatos = new ArrayList<>();

    public static void exibirMenu() {
        boolean sair = true;

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
                    listarContatos();
                    break;
                case 3:
                    editarContatos();
                    break;
                case 4:
                    removerContatos();
                    break;
                case 5:
                    pesquisarContatos();
                    break;
                case 6:
                    sair = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (sair);
    }

    public static void adicionarContatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone do contato:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email do contato:");
        String email = scanner.nextLine();

        Contato contato = new Contato(nome, telefone, email);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public static void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato c : contatos) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("Email: " + c.getEmail());
                System.out.println("-----------------------");
            }
        }
    }

    public static void editarContatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do contato que deseja editar:");
        String nome = scanner.nextLine();

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite o novo telefone:");
                String novoTelefone = scanner.nextLine();
                System.out.println("Digite o novo email:");
                String novoEmail = scanner.nextLine();

                c.setTelefone(novoTelefone);
                c.setEmail(novoEmail);
                System.out.println("Contato atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public static void removerContatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do contato que deseja remover:");
        String nome = scanner.nextLine();

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(c);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public static void pesquisarContatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do contato que deseja pesquisar:");
        String nome = scanner.nextLine();

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("Email: " + c.getEmail());
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}
