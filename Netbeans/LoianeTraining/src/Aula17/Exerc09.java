/*
 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc09 {
    public static void main(String[] args) {
        System.out.println("");
        
        int i;
        for(i=1;i<=50;i++){
           if(i%2 != 0 )
                System.out.println(i);
        }
    }
}
