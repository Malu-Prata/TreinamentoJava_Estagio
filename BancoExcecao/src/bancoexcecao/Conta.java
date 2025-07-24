package bancoexcecao;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito: " + valor);
        }
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
