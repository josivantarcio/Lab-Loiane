package src;
import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        System.out.println("Digite nota do aluno:");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nota1 : ");
        float nt1 = scan.nextFloat();
        
        System.out.print("Nota2 : ");
        float nt2 = scan.nextFloat();
        
        float media = (nt1 + nt2)/2;
        System.out.println("media: "+media);
        if (media != 10)
            if (media <7)
                System.out.println("Reprovado");
            else
                System.out.println("Aprovado");
        else 
            System.out.println("Aprovado com Distinção!");
    }
}
