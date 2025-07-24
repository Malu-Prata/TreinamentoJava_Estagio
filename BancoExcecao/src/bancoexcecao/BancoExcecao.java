package bancoexcecao;

public class BancoExcecao {
    public static void main(String[] args) {
        Conta c = new Conta();

        try {
            System.out.println("Tentando depositar R$100");
            c.deposito(100);
            System.out.println("Depósito feito com sucesso! Saldo atual: R$" + c.getSaldo());

            System.out.println("\nTentando depositar R$-50");
            c.deposito(-50);  // eh pra excecao ser lancada aqui 

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
            e.printStackTrace();  // mostra o stacktrace
        }

        System.out.println("\nFim do programa.");
    }
}
