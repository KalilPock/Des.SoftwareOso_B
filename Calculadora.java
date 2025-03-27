public class Calculadora{
    public static void main(String[] args) {
       
        int resultado = somar(5, 3);
        System.out.println("O resultado da soma é: " + resultado);
        }

        public static int somar(int a, int b) {
        return a + b;
        }

        public static int subtrair(int a, int b) {
            return a - b;
        }

        public static int  multiplicar(int a, int b){
            return a * b;
        }

        public static int dividir(int a, int b){
            return a / b;
        }
}