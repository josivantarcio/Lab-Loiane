package Aula15;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args){
        System.out.print("Digite o Ano: ");
        Scanner bis = new Scanner(System.in);
        
        float ano = bis.nextFloat();
        if(ano % 400 == 0 ||(ano % 4 == 0 && ano % 100 !=0))        
            System.out.println((int)ano+ " É Ano Bissexto.");
        else
            System.out.println((int)ano+ " Não é Bissexto.");    
    }
}
