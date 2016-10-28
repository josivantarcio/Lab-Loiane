/*
 *  Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. 
 *  Ex.: 5!=5.4.3.2.1=120. 
 *  A saída deve ser conforme o exemplo abaixo: o Fatorial de: 5  o 5! =  5 . 4 . 3 . 2 . 1 = 120
 */
package Aula17;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc26 {
    public static void main(String[] args) {
    
    Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int num = scan.nextInt();
        int resultado = 1;
        int i = num;
        System.out.print(num+"! ");
        for(; i >0; i--){
            resultado = resultado * i;
            System.out.print(" . "+i);
        }
        System.out.println(" = "+resultado+"");
    }
}