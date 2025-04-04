public class Conta {

    private String nomeTitular;
    private String numeroConta;
    private double saldo;

    public Conta(String nomeTitular, String numeroConta2) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta2;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
        return saldo >= 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getnomeProprietario() {
        return nomeTitular;
    }

    public String getnumeroConta() {
        return numeroConta;
    }
    public void setnomeProprietario(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public void setnumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
