package src;
import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args){
        Scanner cc = new Scanner(System.in);
        
        System.out.println("Digite Notas do Aluno");
        System.out.println("=====================");
        System.out.print("Nota 1 : ");
        float nt1 = cc.nextFloat();
        
        System.out.print("Nota 2 : ");
        float nt2 = cc.nextFloat();
        
        float media = (nt1+nt2)/2;
        char conceito;
        if (media >=9 && media <= 10)
            conceito = 'A';
        else if (media >=7.5 && media <9)
            conceito = 'B';
        else if (media >= 6 && media <7.5)
            conceito = 'C';
        else if (media >= 4 && media <6)
            conceito = 'D';
        else 
            conceito = 'E';
        
       // System.out.println("Nota 1: "+nt1);
       // System.out.println("Nota 2: "+nt2);
        System.out.println("---------------------");
        System.out.println("Média : "+media);
        System.out.println("Aluno com Conceito: "+conceito);
        System.out.println("=====================");
        
        switch (conceito){
            case 'A':
            case 'B':
            case 'C': System.out.println("APROVADO");break;
            case 'D':
            case 'E': System.out.println("REPROVADO");break;
            default: System.out.println("ERRO!! Favor refazer.");
        }
    }
}
