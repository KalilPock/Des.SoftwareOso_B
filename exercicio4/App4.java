import java.util.ArrayList;

public class App4 {

    //Somente a inicialização do sistema
    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao sistema de jogadores!");
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador.exibirMenu(jogadores); // Lógica do menu feita na classe Jogador
    }
}
