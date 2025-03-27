import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo à calculadora");

        System.out.println("Digite o primeiro número: ");
        int entrada1;
        Scanner scanner = new Scanner(System.in);
        entrada1 = scanner.nextInt();
        System.out.println("O primeiro número é: " + entrada1);

        //Captura o 2 numero
        System.out.println("Digite o segundo número: ");
        int entrada2;
        entrada2 = scanner.nextInt();
        System.out.println("O segundo número é: " + entrada2);

        //seleciona a operação desejada
        // System.out.println("Deseja: ");
        // String operacao;
        // operacao = scanner.nextInt();




    }
}