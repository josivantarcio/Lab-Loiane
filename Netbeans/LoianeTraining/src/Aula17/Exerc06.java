/*
Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que 
ele mostre os números um ao lado do outro */
package Aula17;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("(F)Fila (P)Pilha");
        String s = scan.next();
        
        if(s.equalsIgnoreCase("F")){
            for(int i = 1; i<=20; i++){
                  System.out.println(i);
            }
        }else if(s.equalsIgnoreCase("P")){
            for (int x = 1; x<=20; ++x){
                System.out.print(x+ " ");
            }
        }
    }
}