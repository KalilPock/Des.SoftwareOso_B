import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String enderecoEntrega;
    private List<Pizza> pizzas;
    private double valorTotal;

    public Pedido(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        this.pizzas = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
        System.out.println("Pizza adicionada ao pedido: " + pizza.getNome());
    }

    public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0;
        System.out.println("Pedido cancelado.");
    }

    public void exibirDetalhes() {
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("Pizzas no pedido:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("Valor total: R$" + valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }
}