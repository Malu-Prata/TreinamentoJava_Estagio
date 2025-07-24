package banco;

public class ContaEspecial extends Conta {

    // Construtor padrão (sem parâmetros)
    public ContaEspecial() {
        super(); // chama Conta()
    }

    // Construtor com número da conta
    public ContaEspecial(int numeroConta) {
        super(numeroConta); // chama Conta(int)
    }

    // Construtor com número da conta e saldo
    public ContaEspecial(int numeroConta, double saldo) {
        super(numeroConta, saldo); // chama Conta(int, double)
    }

    // Sobrescreve o método atualiza, multiplicando a taxa por 2 antes de atualizar
    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 2);
    }

    // Sobrescreve o método saque, descontando 0,10 a mais do saldo
    @Override
    public void saque(double valor) {
        // chama o saque com o valor + 0.10 para descontar a taxa extra
        super.saque(valor + 0.10);
    }
}
