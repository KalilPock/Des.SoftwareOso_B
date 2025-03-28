import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        do { 
            System.out.println("Bem-Vindo à calculadora");

            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite o primeiro número:");
            int entrada1 = scanner.nextInt();
    
            System.out.println("Digite o segundo número:");
            int entrada2 = scanner.nextInt();
    
            System.out.println("Escolha a operação: 1-Somar, 2-Subtrair, 3-Multiplicar, 4-Dividir");
            int operacao = scanner.nextInt();
    
            switch (operacao) {
                case 1:
                    System.out.println("**************************************");
                    System.out.println("Resultado: " + Calculadora.somar(entrada1, entrada2));
                    break;
                case 2:
                     System.out.println("**************************************");
                    System.out.println("Resultado: " + Calculadora.subtrair(entrada1, entrada2));
                    break;
                case 3:
                    System.out.println("**************************************");
                    System.out.println("Resultado: " + Calculadora.multiplicar(entrada1, entrada2));
                    break;
                case 4:
                    if (entrada2 != 0) {
                                    System.out.println("**************************************");
                                    System.out.println("Deseja continuar? 1-Sim, 2-Não");
                        System.out.println("Resultado: " + Calculadora.dividir(entrada1, entrada2));
                    } else {
                        System.out.println("**************************************");
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    scanner.close();
            }

            System.out.println("**************************************");
            System.out.println("Deseja continuar? 1-Sim, 2-Não");
            int continuarOp = scanner.nextInt();
            if (continuarOp == 2) {
                continuar = false;
            }

        } while (continuar = true);





    }
}
