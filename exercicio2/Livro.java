import java.util.ArrayList;

public class Livro {
    private String nome;
    private String autor;
    private int ano;

    private static ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String nome, String autor, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        livros.add(this);
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public static Livro ConsultaLivro(String nome) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null;
    }
}