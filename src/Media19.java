import java.util.Scanner;

public class Media19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do 1º bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do 2º bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do 4º bimestre: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
