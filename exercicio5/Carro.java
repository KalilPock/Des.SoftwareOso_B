import java.util.ArrayList;

public class Carro {

    private int ano;
    private String marca;
    private String modelo;
    private double velocidadeAtual;
    private String placa;

    ArrayList<Carro> carros = new ArrayList<>();
    public Carro(int ano, String marca, String modelo, double velocidadeAtual, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public static void exibirMenu(ArrayList<Carro> carros) {
        System.out.println("Bem-Vindo ao sistema de carros!");
    }
    
}
