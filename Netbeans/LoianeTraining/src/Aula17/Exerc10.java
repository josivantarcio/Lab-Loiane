/*
 *  Faça um programa que receba dois números inteiros e gere os números 
inteiros que estão no intervalo compreendido por eles.  
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Entre com a nota 1 e 2");
        
        num1=scan.nextInt();
        num2=scan.nextInt();
        
        if(num1 < num2){
            for(int i = num1; i<num2; i++)
                System.out.println(i);
        }else if(num1 > num2){
            for(int i = num2; i<num1; i++)
                System.out.println(i);
        }       
    }
}
