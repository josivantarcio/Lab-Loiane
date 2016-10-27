/*
 *  A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
 *  Faça um programa que gere a série até que o valor seja maior que 500. .
 */
package Aula17;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da serie");
        int serie = scan.nextInt();
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;
        
        System.out.println(primeiro);
        System.out.println(segundo);
//        for(int i =3; 1 < serie; i++)
            while(proximo <= 500){
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
                System.out.println(" -> "+proximo);
            }
        System.out.println("fim do loop");
    }
}
