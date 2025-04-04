import java.util.ArrayList;
import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao sistema de jogadores!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        boolean sair = true;
        int opcao; 

        do { 
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar Jogador");
            System.out.println("2 - Aumentar Pontuação");
            System.out.println("3 - Diminuir Pontuação");
            System.out.println("4 - Zerar Pontuação");
            System.out.println("5 - Aumentar Nível");
            System.out.println("6 - Consultar Jogador");
            System.out.println("7 - Sair");
            opcao = scanner.nextInt(); // Atualiza a opção escolhida pelo usuário

            switch (opcao) {
                case 1 :
                    System.out.println("Digite o nome do jogador:");
                    String nome = scanner.next();
                    System.out.println("Digite a pontuação do jogador:");
                    int pontuacao = scanner.nextInt();
                    System.out.println("Digite o nível do jogador:");
                    int nivel = scanner.nextInt();
                    Jogador jogador = new Jogador(nome, pontuacao, nivel);
                    jogadores.add(jogador);
                    System.out.println("Jogador criado com sucesso!");
                    break;
                case 2 :
                System.out.println("Digite o nome do jogador:");
                String nomeAumento = scanner.next();
                System.out.println("Digite a quantidade de pontos a aumentar:");
                int pontosAumento = scanner.nextInt();
                boolean jogadorEncontrado = false;

                for (Jogador j : jogadores) {
                    if (j.getNome().equalsIgnoreCase(nomeAumento)) {
                        j.aumentarPontuacao(pontosAumento);
                        System.out.println("Pontuação aumentada com sucesso!");
                        jogadorEncontrado = true;
                        break;
                    }
                }
                if (!jogadorEncontrado) {
                    System.out.println("Jogador não encontrado.");
                }
                break;
                case 3 :
                    // Implementar lógica para aumentar nível
                    break;
                case 4 :
                    // Implementar lógica para diminuir pontuação
                    break;
                case 5 :
                    // Implementar lógica para zerar pontuação
                    break;
                case 6 :
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

                    break;
                case 7 :
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (sair);
        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
