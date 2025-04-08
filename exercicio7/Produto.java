public class Produto {

    private String nome;
    private String id;
    private int quantidadeEstoque;
    private double preco;

    public Produto(String nome, String id, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.id = id;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
