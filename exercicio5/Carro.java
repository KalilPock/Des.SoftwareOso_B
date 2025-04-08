import java.util.ArrayList;
import java.util.Scanner;

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

    public static void criarCarro(ArrayList<Carro> carros, Scanner scanner) {
        System.out.println("Digite o ano do carro:");
        int ano = scanner.nextInt();
        System.out.println("Digite a marca do carro:");
        String marca = scanner.next();
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.next();
        System.out.println("Digite a velocidade atual do carro:");
        double velocidadeAtual = scanner.nextDouble();
        System.out.println("Digite a placa do carro:");
        String placa = scanner.next();

        Carro carro = new Carro(ano, marca, modelo, velocidadeAtual, placa);
        carros.add(carro);
    }

    public static void acelerarCarro(ArrayList<Carro> carros, Scanner scanner) {
        System.out.println("Digite a placa do carro que deseja acelerar:");
        String placa = scanner.next();
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Digite a quantidade de aceleração:");
                double aceleracao = scanner.nextDouble();
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() + aceleracao);
                System.out.println("Carro acelerado com sucesso!");
                return;
            }
        }
        System.out.println("Carro não encontrado.");
    }

    public static void frearCarro(ArrayList<Carro> carros, Scanner scanner) {
        System.out.println("Digite a placa do carro que deseja frear:");
        String placa = scanner.next();
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Digite a quantidade de desaceleração:");
                double desaceleracao = scanner.nextDouble();
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() - desaceleracao);
                System.out.println("Carro freado com sucesso!");
                return;
            }
        }
        System.out.println("Carro não encontrado.");
    }

    public static void consultaCarro(ArrayList<Carro> carros, Scanner scanner) {
        System.out.println("Digite a placa do carro que deseja consultar:");
        String placa = scanner.next();
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Carro encontrado:");
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual());
                return;
            }
        }
        System.out.println("Carro não encontrado.");
    }

    public static void exibirMenu(ArrayList<Carro> carros) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = true;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar Carro");
            System.out.println("2 - Acelerar Carro");
            System.out.println("3 - Frear Carro");
            System.out.println("4 - Consultar Carro");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarCarro(carros, scanner);
                    break;
                case 2:
                    acelerarCarro(carros, scanner);
                    break;
                case 3:
                    frearCarro(carros, scanner);
                    break;
                case 4:
                    consultaCarro(carros, scanner);
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
    
}
