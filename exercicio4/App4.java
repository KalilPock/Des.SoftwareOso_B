import java.util.ArrayList;

public class App4 {

    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao sistema de jogadores!");
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador.exibirMenu(jogadores); // Delegando a lógica do menu para a classe Jogador
    }
}
