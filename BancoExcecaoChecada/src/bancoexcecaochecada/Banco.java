package bancoexcecaochecada;

public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 100.0);

        try {
            conta.deposito(50.0);   
            conta.deposito(-20.0);    // lanca a excecao
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}
