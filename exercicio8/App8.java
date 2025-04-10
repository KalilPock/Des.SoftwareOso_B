import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App8 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Pizza> pizzasDisponiveis = new ArrayList<>();
    private static final List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        inicializarPizzas();

        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    fazerNovoPedido();
                    break;
                case 2:
                    exibirPedidos();
                    break;
                case 3:
                    cancelarPedido();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void inicializarPizzas() {
        pizzasDisponiveis.add(new Pizza("Mussarela", 30.0, Arrays.asList("Queijo", "Molho de tomate")));
        pizzasDisponiveis.add(new Pizza("Calabresa", 35.0, Arrays.asList("Calabresa", "Cebola", "Queijo")));
        pizzasDisponiveis.add(new Pizza("Frango com Catupiry", 40.0, Arrays.asList("Frango", "Catupiry", "Queijo")));
    }

    private static void exibirMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1 - Fazer novo pedido");
        System.out.println("2 - Exibir pedidos");
        System.out.println("3 - Cancelar pedido");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void fazerNovoPedido() {
        System.out.println("Digite o endereço de entrega:");
        String endereco = scanner.nextLine();
        Pedido pedido = new Pedido(endereco);

        boolean adicionarMais = true;
        while (adicionarMais) {
            System.out.println("\n--- Pizzas Disponíveis ---");
            for (int i = 0; i < pizzasDisponiveis.size(); i++) {
                System.out.println((i + 1) + " - " + pizzasDisponiveis.get(i));
            }
            System.out.print("Escolha uma pizza pelo número: ");
            int escolhaPizza = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (escolhaPizza > 0 && escolhaPizza <= pizzasDisponiveis.size()) {
                Pizza pizzaEscolhida = pizzasDisponiveis.get(escolhaPizza - 1);
                pedido.adicionarPizza(pizzaEscolhida);
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja adicionar mais pizzas? (s/n): ");
            String resposta = scanner.nextLine();
            adicionarMais = resposta.equalsIgnoreCase("s");
        }

        pedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso!");
    }

    private static void exibirPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
        } else {
            System.out.println("\n--- Pedidos Registrados ---");
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println("Pedido " + (i + 1) + ":");
                pedidos.get(i).exibirDetalhes();
                System.out.println("-----------------------");
            }
        }
    }

    private static void cancelarPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido para cancelar.");
        } else {
            System.out.println("Digite o número do pedido que deseja cancelar:");
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println((i + 1) + " - Pedido para " + pedidos.get(i).getValorTotal());
            }
            int numeroPedido = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (numeroPedido > 0 && numeroPedido <= pedidos.size()) {
                pedidos.remove(numeroPedido - 1);
                System.out.println("Pedido cancelado com sucesso!");
            } else {
                System.out.println("Número de pedido inválido.");
            }
        }
    }
}
