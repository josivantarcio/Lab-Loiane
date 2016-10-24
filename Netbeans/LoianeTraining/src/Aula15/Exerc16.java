package Aula15;

import java.util.Scanner;


public class Exerc16 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    //ax2 + bx + c
    System.out.print("Digite o Valor de a : ");
    float a = scan.nextFloat();
        if (a == 0){
            System.out.println("A Equação não é do 2°Grau");
            System.out.println("O PROGRAMA SERÁ ENCERRADO!");
        }else{
            System.out.print("Digite o Valor de b : ");
            float b = scan.nextFloat();
            System.out.print("Digite o Valor de c : ");
            float c = scan.nextFloat();
        
            //System.out.println("ax2 + bx + c = 0");
            //System.out.println((int)a+"x2 + "+(int)b+"x + "+(int)c+"= 0");

            //calcular delta   d = b2 -4ac
            float d = 0;
            d = (float)(Math.pow(b, 2)- (4*a*c));
            System.out.println("delta = "+(int)d);
                if(d<0){
                    System.out.println("Valor do delta Negativo");
                    System.out.println("O Programa será encerrado");
                }else if(d == 0){
                    System.out.println("O delta calculado possui apenas uma raiz real.");
                }else{                    
                //x = (-b +- Rd)/2a
                    System.out.println("O delta é Positivo. Possui duas raizes reais.");
                float x1, x2 = 0;
                x1 = (float) (-(b) + (Math.sqrt(d)))/(2*a);
                x2 = (float) (-(b) - (Math.sqrt(d)))/(2*a);
                
                    System.out.println("A Solução dessa equação é {"+(int)x1+","+(int)x2+"}.");
                    
                
                }
                
        }
       
    }    
}
