import java.util.Scanner;

public class App2{
    public static void main(String[] args) {

        boolean sair = true;      
        
        do {

            System.out.println("Bem-Vindo ao acervo de livros!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Consultar Livro");
            System.out.println("3 - Sair");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    String nome = scanner.next();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.next();
                    System.out.println("Digite o ano de publicação do livro:");
                    int ano = scanner.nextInt();
                    Livro livro = new Livro(nome, autor, ano);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do livro:");
                    String nomeConsulta = scanner.next();
                    Livro livroConsulta = Livro.ConsultaLivro(nomeConsulta);
                    if (livroConsulta != null) {
                        System.out.println("Nome: " + livroConsulta.getNome());
                        System.out.println("Autor: " + livroConsulta.getAutor());
                        System.out.println("Ano: " + livroConsulta.getAno());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (sair == true);
    }   

}

