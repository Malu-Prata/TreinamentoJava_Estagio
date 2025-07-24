package bancoexcecaochecada;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void deposito(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito inválido: " + valor);
        }
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }
}
