package src;

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Responda as pergundas com '1'SIM e '0'NÃO");
        
        int alibi=0;
        
        System.out.println("PERGUNTA 1 : Telefonou para a vítima? '1'SIM e '0'NÃO");
            int perg1 = ask.nextInt();
            if(perg1 == 1)
            alibi = alibi+1;
        
        System.out.println("PERGUNTA 2 : Esteve no Local do Crime? '1'SIM e '0'NÃO");
            int perg2 = ask.nextInt();
            if(perg2 == 1)
            alibi = alibi+1;
        
        System.out.println("PERGUNTA 3 : Mora Perto da vítima '1'SIM e '0'NÃO");
            int perg3 = ask.nextInt();
            if (perg3 ==  1)
            alibi = alibi+1;
            
        System.out.println("PERGUNTA 4 : Devia para a vítima? '1'SIM e '0'NÃO");
            int perg4 = ask.nextInt();
            if(perg4 == 1)
            alibi = alibi+1;
        
        System.out.println("PERGUNTA 5 : Já Trabalhou com a vítima? '1'SIM e '0'NÃO");
            int perg5 = ask.nextInt();
            if (perg5 ==  1)
            alibi = alibi+1;
            
        System.out.println("alibi nr"+alibi);
        
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
