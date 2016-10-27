/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 
 */
package Aula17;
import java.util.*;
/**
 *
 * @author Josevan
 */
public class Exerc17 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int num = scan.nextInt();
        int resultado = 1;
        for(int i = num; i >0; i--){
            resultado = resultado * i;
            System.out.println(i + " ");
        }
        System.out.println(resultado); 
    }
}
