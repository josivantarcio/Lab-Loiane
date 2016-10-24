package Aula15;

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Responda as pergundas com 'S'SIM e 'N'NÃO");
        
        int alibi=0;
        
        System.out.println("PERGUNTA 1 : Telefonou para a vítima? 'S'SIM e 'N'NÃO");
            String perg1 = ask.next();
            if(perg1.equalsIgnoreCase("S"))
           alibi++;
        
        System.out.println("PERGUNTA 2 : Esteve no Local do Crime? 'S'SIM e 'N'NÃO");
            String perg2 = ask.next();
            if(perg2.equalsIgnoreCase("S"))
           alibi++;
        
        System.out.println("PERGUNTA 3 : Mora Perto da vítima 'S'SIM e 'N'NÃO");
            String perg3 = ask.next();
            if (perg3.equalsIgnoreCase("S"))
           alibi++;
            
        System.out.println("PERGUNTA 4 : Devia para a vítima? 'S'SIM e 'N'NÃO");
            String perg4 = ask.next();
            if(perg4.equalsIgnoreCase("S"))
           alibi++;
        
        System.out.println("PERGUNTA 5 : Já Trabalhou com a vítima? 'S'SIM e 'N'NÃO");
            String perg5 = ask.next();
            if (perg5.equalsIgnoreCase("S"))
           alibi++;
            
        System.out.println("alibi nr "+alibi);
        
        switch (alibi){
            case 2: 
                System.out.println("SUSPEITO");
            break;
            case 3: case 4:
                System.out.println("CÚMPLICE");
            break;
            case 5:
                System.out.println("ASSASSINO");
            break;
            default:
                System.out.println("INOCENTE");
               
        }
    }
}
