import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in, "cp850");
        String frase = "";
        String fraseFormatada = "";
        int pontuação;

        char[] letrasSemAcento = {'A','A','A','A','E','E','E','I','I','I','O','O','O','O','U','U','U'};
        char[] letrasComAcento = {'Á','À','Ã','Â','É','È','Ê','Í','Ì','Î','Ó','Ò','Õ','Ô','Ú','Ù','Û'};
        char[] simbolos = {'?','/','°','!','@','#','$','%','¨','&','*','(',')','_','-','+','=','§',
        '[',']','{','}','ª','º','|','¹','²','³','¬','£','¢','<','>',',','.',':',';'};

        System.out.println("---------------------------------");
        System.out.println("     BEM VINDO AO CIFRADOR");        
        System.out.println("---------------------------------");
        System.out.println("\nEscolha uma das opções abaixo: \n1- Cifrador\n2- Decifrador\n0- sair");


        

    }
}