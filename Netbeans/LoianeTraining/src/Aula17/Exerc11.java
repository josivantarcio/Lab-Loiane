/*
 Altere o programa anterior para mostrar no final a soma dos números
 *
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o segundo numero");
        int num2 = scan.nextInt();
        
        int somar = 0;
        if(num1 < num2){
            for(int i = num1; i <= num2; i++){
                somar += i;
                System.out.println(i);
            }
        }else if(num2 < num1){
            for(int i = num2; i <= num1; i++){
                somar += i;
                System.out.println(i);
            }
        }
        System.out.println("somar: "+somar);
    }
}
