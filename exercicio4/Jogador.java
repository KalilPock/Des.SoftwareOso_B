import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void aumentaPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public void diminuiPontuacao(int pontos) {
        this.pontuacao -= pontos;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    public static void exibirMenu(ArrayList<Jogador> jogadores) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = true;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar Jogador");
            System.out.println("2 - Atualizar Pontuação");
            System.out.println("3 - Atualizar Nível");
            System.out.println("4 - Consultar Jogador");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarJogador(jogadores, scanner);
                    break;
                case 2:
                    atualizarPontuacao(jogadores, scanner);
                    break;
                case 3:
                    atualizarNivel(jogadores, scanner);
                    break;
                case 4:
                    consultarJogador(jogadores, scanner);
                    break;
                case 5:
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (sair);

        System.out.println("Sistema encerrado.");
        scanner.close();
    }

    private static void criarJogador(ArrayList<Jogador> jogadores, Scanner scanner) {
        System.out.println("Digite o nome do jogador:");
        String nome = scanner.next();
        System.out.println("Digite a pontuação do jogador:");
        int pontuacao = scanner.nextInt();
        System.out.println("Digite o nível do jogador:");
        int nivel = scanner.nextInt();
        Jogador jogador = new Jogador(nome, pontuacao, nivel);
        jogadores.add(jogador);
        System.out.println("Jogador criado com sucesso!");
    }

    private static void atualizarPontuacao(ArrayList<Jogador> jogadores, Scanner scanner) {

        System.out.println("Digite 1 para aumentar a pontuação ou 2 para diminuir:");
        int opcao = scanner.nextInt();
        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida.");
            return;
        }
        if (opcao == 1) {
            System.out.println("Digite o nome do jogador:");
            String nomeAumento = scanner.next();
            System.out.println("Digite a quantidade de pontos a aumentar:");
            int pontosAumento = scanner.nextInt();
            boolean jogadorEncontrado = false;
    
            for (Jogador j : jogadores) {
                if (j.getNome().equalsIgnoreCase(nomeAumento)) {
                    j.aumentaPontuacao(pontosAumento);
                    System.out.println("Pontuação aumentada com sucesso!");
                    jogadorEncontrado = true;
                    break;
                }
            }
            if (!jogadorEncontrado) {
                System.out.println("Jogador não encontrado.");
            }
        } else {
            System.out.println("Digite o nome do jogador:");
            String nomeDiminui = scanner.next();
            System.out.println("Digite a quantidade de pontos a dimiuir:");
            int pontosDiminui = scanner.nextInt();
            boolean jogadorEncontrado = false;
    
            for (Jogador j : jogadores) {
                if (j.getNome().equalsIgnoreCase(nomeDiminui)) {
                    j.diminuiPontuacao(pontosDiminui);
                    System.out.println("Pontuação dimiuida com sucesso!");
                    jogadorEncontrado = true;
                    break;
                }
            }
            if (!jogadorEncontrado) {
                System.out.println("Jogador não encontrado.");
            }
        }
    }

    private static void atualizarNivel(ArrayList<Jogador> jogadores, Scanner scanner) {

        System.out.println("Digite 1 para aumentar o nível ou 2 para diminuir:");
        int opcao = scanner.nextInt();
        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida.");
            return;
        }
        if (opcao == 1) {
            System.out.println("Digite o nome do jogador:");
            String nomeAumento = scanner.next();
            System.out.println("Digite a quantidade de níveis a aumentar:");
            int niveisAumento = scanner.nextInt();
            boolean jogadorEncontrado = false;

            for (Jogador j : jogadores) {
                if (j.getNome().equalsIgnoreCase(nomeAumento)) {
                    j.setNivel(j.getNivel() + niveisAumento);
                    System.out.println("Nível aumentado com sucesso!");
                    jogadorEncontrado = true;
                    break;
                }
            }
            if (!jogadorEncontrado) {
                System.out.println("Jogador não encontrado.");
            }
            return;
        }
        if (opcao == 2) {
            System.out.println("Digite o nome do jogador:");
            String nomeDiminui = scanner.next();
            System.out.println("Digite a quantidade de níveis a diminuir:");
            int niveisDiminui = scanner.nextInt();
            boolean jogadorEncontrado = false;

            for (Jogador j : jogadores) {
                if (j.getNome().equalsIgnoreCase(nomeDiminui)) {
                    j.setNivel(j.getNivel() - niveisDiminui);
                    System.out.println("Nível diminuido com sucesso!");
                    jogadorEncontrado = true;
                    break;
                }
            }
            if (!jogadorEncontrado) {
                System.out.println("Jogador não encontrado.");
            }
            return;
        }
    }

    private static void consultarJogador(ArrayList<Jogador> jogadores, Scanner scanner) {
        System.out.println("Digite o nome do jogador que deseja consultar:");
        String nomeConsulta = scanner.next();
        boolean encontrado = false;

        for (Jogador j : jogadores) {
            if (j.getNome().equalsIgnoreCase(nomeConsulta)) {
                j.exibirInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jogador não encontrado.");
        }
    }

}
