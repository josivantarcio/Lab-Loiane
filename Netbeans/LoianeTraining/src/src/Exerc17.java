package src;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args){
        System.out.print("Digite o Ano: ");
        Scanner biss = new Scanner(System.in);
        
        float bi = biss.nextFloat();
        if((bi % 4) == 0){
            if((bi % 100) == 0){
                if ((bi % 400) == 0){}
            }        
            System.out.println((int)bi+ " É Ano Bissexto.");
        }else
            System.out.println((int)bi+ " Não é Bissexto.");    
    }
}
