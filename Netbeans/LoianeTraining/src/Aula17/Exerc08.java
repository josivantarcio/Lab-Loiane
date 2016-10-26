//Faça um programa que leia 5 números e informe a soma e a média dos números. 
 
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc08 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        
        int numero = 0, cont=0;
        int i = 1;
        for (;i<=5;i++){
            System.out.println("Digite o nr"+i);
            numero = up.nextInt();
            
            cont += numero;
        }
        System.out.println("(+)" +cont);
        System.out.println("media:" +(cont/(i-1)));
    }
}
