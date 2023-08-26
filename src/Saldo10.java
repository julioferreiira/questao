public class Saldo10 {
    public static void main(String[] args) {
        double saldo = 500.50;

        double deposito = 300.25;
        saldo += deposito;

        double saque = 150.75;
        saldo -= saque;

        System.out.println("Saldo atual: " + saldo);
    }
}
