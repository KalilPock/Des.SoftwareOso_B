public class Livro {

    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public static void CadastroLivro(){

        System.out.println("Cadastro de Livro");
    }

    public static void ConsultaLivro(){

        System.out.println("Consulta de Livro");
    }

}
