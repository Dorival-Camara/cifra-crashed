import java.util.Scanner;

public class main{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("     BEM VINDO AO CIFRADOR");        
        System.out.println("---------------------------------");
        System.out.println("Insira uma frase para cifrá-la: ");
        String frase = scanner.nextLine();

        int caracteres = frase.length();
        System.out.println(caracteres);

    }
}