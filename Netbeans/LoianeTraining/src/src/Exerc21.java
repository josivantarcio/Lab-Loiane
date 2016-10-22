package src;

import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner fuel = new Scanner(System.in);
        
        float G = 2.5f;
        float E = 1.9f, desconto = 0, valorPagoi = 0, valorPagof = 0; 
        
        System.out.println("Informe qual produto deseja:");
        System.out.println("(G)Gasolina (E)Etanol");
        String tipoCombust = fuel.next();
        
        switch (tipoCombust){
            case "G":; case "g":;    
            case "E":; case "e":;
        
            System.out.println("Quantidade?");
            float quant = fuel.nextFloat();


            switch (tipoCombust){
                case "g": case "G":
                    valorPagoi = quant*G;
                    if(quant <= 20){
                        desconto = ((valorPagoi)/100)*4;
                    }
                    else if(quant > 20){
                       desconto = ((valorPagoi)/100)*6;
                    }    
                    System.out.println(" Gasolina "+"R$"+G);
                    break;

                case "e": case "E":
                    valorPagoi = quant*E;
                    if(quant <= 20){
                        desconto = ((valorPagoi)/100)*3;
                    }
                    else if(quant > 20){
                        desconto = ((valorPagoi)/100)*5;
                    }
                    System.out.println(" Etanol " + "R$"+E);
                    break;
            }
            valorPagof = valorPagoi-desconto;

            System.out.println("Pagou........:"+valorPagoi+" (-)"+desconto+" === "+valorPagof+ "(R$)");
            System.out.println("Comprou......: "+quant+"(L)");
            
            break;
            default:
                System.out.println("ERRO : Favor Informar Tipo de Combustível!");
            }
        
        
    }
}
