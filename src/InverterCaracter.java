import java.util.Scanner;

public class InverterCaracter  {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        System.out.println("Digite sua frase para reverter os caracteres");
        palavra = ler.nextLine();
        int tamanho = palavra.length()-1;
        char[] charPalavra = palavra.toCharArray();
        String palavraInvertida="";



        for(int y=tamanho;y>=0;y--){
            palavraInvertida = palavraInvertida + String.valueOf(charPalavra[y]);
        }

        System.out.println("A frase inversa é : " +palavraInvertida );
    }
}
