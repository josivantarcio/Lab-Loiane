package Aula15;
import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args){
        Scanner conteiner = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        int numeroPar = conteiner.nextInt();
        
        if(numeroPar % 2 == 0)
            System.out.println(numeroPar+" É Par!");
        else
            System.out.println(numeroPar+" É Impar!");
    }
}
