import java.util.ArrayList;
import java.util.Scanner;

public class App7 {

    static ArrayList<Produto> produtos = new ArrayList<>();
    public static void main(String[] args) {
        
        boolean sair = false;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Listar produtos");
            System.out.println("4. Editar produto");
            System.out.println("5. Gerar relatório");
            System.out.println("6. Sair");
            
            int opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    editarProduto();
                    break;
                case 5:
                    gerarRelatorio();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            } while (!sair);
        }

        public static void adicionarProduto() {
            System.out.println("Digite o nome do produto:");
            Scanner scanner = new Scanner(System.in);
            String nome = scanner.nextLine();
            System.out.println("Digite o ID do produto:");
            String id = scanner.nextLine();
            System.out.println("Digite a quantidade em estoque:");
            int quantidadeEstoque = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o preço do produto:");
            double preco = Double.parseDouble(System.console().readLine());

            Produto produto = new Produto(nome, id, quantidadeEstoque, preco);
            produtos.add(produto);
        }

        public static void removerProduto() {
            System.out.println("Digite o ID do produto a ser removido:");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            for (Produto produto : produtos) {
                if (produto.getId().equals(id)) {
                    produtos.remove(produto);
                    System.out.println("Produto removido com sucesso.");
                    return;
                }
            }
            System.out.println("Produto não encontrado.");
        }

        public static void listarProdutos() {
            System.out.println("Lista de produtos:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("ID: " + produto.getId());
                System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("-----------------------------");
            }
        }

        public static void editarProduto() {
            System.out.println("Digite o ID do produto a ser editado:");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            for (Produto produto : produtos) {
                if (produto.getId().equals(id)) {
                    System.out.println("Digite o novo nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a nova quantidade em estoque:");
                    int quantidadeEstoque = Integer.parseInt(System.console().readLine());
                    System.out.println("Digite o novo preço do produto:");
                    double preco = Double.parseDouble(System.console().readLine());

                    produto.setNome(nome);
                    produto.setQuantidadeEstoque(quantidadeEstoque);
                    produto.setPreco(preco);
                    System.out.println("Produto editado com sucesso.");
                    return;
                }
            }
            System.out.println("Produto não encontrado.");
        }

        public static void gerarRelatorio() {
            // Implementar lógica para gerar relatório
            System.out.println("Relatório gerado com sucesso.");
        }
        

    }
