package banco;

public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta(10, 0.0);
        Conta c2 = new Conta(9, 5.50);

        System.out.println(c1); // Conta Número: 10
        System.out.println(c2); // Conta Número: 10

        System.out.println("c1.equals(c2)? " + c1.equals(c2)); // true

        c1.deposito(100.0);
        System.out.println("Saldo após depósito: " + c1.getSaldo()); // 100.0

        c1.saque(30.0);
        System.out.println("Saldo após saque: " + c1.getSaldo()); // 70.0

        c1.atualiza(1.05);
        System.out.println("Saldo após atualização (5%): " + c1.getSaldo()); // 73.5
        
        System.out.println("Hash c1: " + c1.hashCode()); // ex: 10
        
        System.out.println("Hash c2: " + c2.hashCode()); // ex: 20

    }
}
