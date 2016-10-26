/*
 * Faça um programa que leia 5 números e informe o maior número
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 5 números ");
        int num=0;
        int maior=Integer.MIN_VALUE;
        
         for(int i = 1;i<=5; i++){
             System.out.println(maior);
            System.out.println("Digite o nr"+i);
            num = scan.nextInt();
            if(num > maior){
                maior = num;
                System.out.println("numero Atual de maior"+maior);
            }
         System.out.println("O Maior numero é: "+maior);
         }
        
    }
}
