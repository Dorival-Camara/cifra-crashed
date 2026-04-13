import java.util.Scanner;

public class main{
    public static void main (String[] args){

        String fraseOriginal = "Quero ser programador. Aprendi Java no Devisate Marília.";

        System.out.println("---------------------------------");
        System.out.println("     BEM VINDO AO CIFRADOR");        
        System.out.println("---------------------------------");

        // Aqui é feita a limpeza da frase
        String fraseLimpa = limparTexto(fraseOriginal);
        
        System.out.println("\nFrase original : ");
        System.out.println(fraseOriginal);

        System.out.println("\nFrase limpa : ");
        System.out.println(fraseLimpa);

        System.out.println("\nTamanho da frase limpa :  "+fraseLimpa.length());

        // Aqui é onde a frase será cifrada e decifrada com salto de 5 caracteres
        int salto = 5;

        System.out.println("" +salto);


    }
}