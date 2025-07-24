package banco;

public class Banco {
    public static void main(String[] args) {
        // cria a conta normal
        Conta contaNormal = new Conta(100, 1000.0);

        // cria a conta especial
        ContaEspecial contaEspecial = new ContaEspecial(200, 1000.0);

        // atualiza a taxa
        contaNormal.atualiza(0.1);
        contaEspecial.atualiza(0.1);
        
        // saldos depois da atualização
        System.out.println("Conta Normal saldo: " + contaNormal.getSaldo());
        System.out.println("Conta Especial saldo: " + contaEspecial.getSaldo());

        // saca 100 em todas as contas
        contaNormal.saque(100.0);
        contaEspecial.saque(100.0);

        // mostra os saldos dps do saque 
        System.out.println("Conta Normal saldo após saque: " + contaNormal.getSaldo());
        System.out.println("Conta Especial saldo após saque: " + contaEspecial.getSaldo());

        // mostra os hashcodes
        System.out.println("HashCode da Conta Normal: " + contaNormal.hashCode());
        System.out.println("HashCode da Conta Especial: " + contaEspecial.hashCode());

        // testa equals
        Conta outraContaNormal = new Conta(100, 50.0);
        System.out.println("contaNormal.equals(outraContaNormal): " + contaNormal.equals(outraContaNormal));
        System.out.println("HashCode outraContaNormal: " + outraContaNormal.hashCode());
    }
}
