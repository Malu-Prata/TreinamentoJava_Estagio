package banco;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta() {
        this(0, 0.0); //cria uma conta vazia - chama outro construtor 
    }

    public Conta(int numeroConta) {
        this(numeroConta, 0.0); // toda conta que for iniciada, vai vir com o saldo zerado 
    }

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta; //atribui o valor do parâmetro ao atributo da instância
        this.saldo = saldo; //atribui o valor do parâmetro ao atributo da instância
    }

    public int getConta() { //get - acessar um valor private
        return numeroConta;
    }

    public void setConta(int numeroConta) { //set- mooficar um valor private
        this.numeroConta = numeroConta;
    }

    public double getSaldo() { 
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa) {
        this.saldo *= taxa;
    }

    @Override //sobrescrevendo um método da superclasse
    public String toString() {
        return "Conta Número: " + numeroConta;
    }

    @Override
    public boolean equals(Object obj) { //equals - compara se os dois objetos sao iguais 
        if (this == obj) return true; // se estao no mesmo endereco de memoria ç
        if (obj == null || getClass() != obj.getClass()) return false; // se o obj é nulo ou nao eh da mesma classe ã
        Conta outra = (Conta) obj; //converte o objeto para a classe Conta 
        return this.numeroConta == outra.numeroConta; //compara os numeros das contas pra saber se sã
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numeroConta); //retorna o inteiro que representa a conta, obj iguais devem retornar o msm hashcode
    }
}
