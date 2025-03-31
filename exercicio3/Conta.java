public class Conta {

    private String nomeProprietario;
    private String cpf;
    private double saldo;

    public Conta(String nomeProprietario, String cpf) {
        this.nomeProprietario = nomeProprietario;
        this.cpf = cpf;
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

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getnomeProprietario() {
        return nomeProprietario;
    }

    public String getCpf() {
        return cpf;
    }
    public void setnomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
