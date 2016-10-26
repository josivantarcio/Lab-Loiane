/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
O usuário deve informar de qual numero ele deseja ver a tabuada. 
 */
package Aula17;
import java.util.Scanner;
      
/**
 *
 * @author Josevan
 */
public class Exerc12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite numero ");
        int num1 = scan.nextInt();
        int result;
        System.out.println("Tabuada de: "+num1);
        for(int i = 0; i<= 10; i++){
            result = i * num1;
            System.out.println(num1 +" X "+i+" = "+result);
        }
                
    }
}
