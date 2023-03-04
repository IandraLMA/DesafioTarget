import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        System.out.println("Digite um valor para Fibonacci(n) ");
        palavra = ler.next();




        CalcularFibonacci calcularFibonacci = new CalcularFibonacci();
        String sequenciaFibonacci = calcularFibonacci.calcularFibonnaci(Integer.parseInt(palavra));



        System.out.println("O Fibonnaci("+palavra+") é  : " + sequenciaFibonacci);
    }
}
