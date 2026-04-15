import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in, "cp850");
        String frase = "";
        String fraseFormatada = "";
        int pontuação;

        char[] letrasSemAcento = {'A','A','A','A','E','E','E','I','I','I','O','O','O','O','U','U','U','C'};
        char[] letrasComAcento = {'Á','À','Ã','Â','É','È','Ê','Í','Ì','Î','Ó','Ò','Õ','Ô','Ú','Ù','Û','Ç'};
        char[] simbolos = {'?','/','°','!','@','#','$','%','¨','&','*','(',')','_','-','+','=','§',
        '[',']','{','}','ª','º','|','¹','²','³','¬','£','¢','<','>',',','.',':',';'};

        System.out.println("---------------------------------");
        System.out.println("     BEM VINDO AO CIFRADOR");        
        System.out.println("---------------------------------");
        System.out.println("\nEscolha uma das opções abaixo: \n1- Cifrador\n2- Decifrador\n0- sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1: 

            System.out.println("Insira uma frase: ");
            frase = scanner.nextLine();

            frase = frese.toUpperCase();

        }






        

    }
}