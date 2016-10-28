/*
 *  Faça um programa que calcule o mostre a média aritmética de N notas. 
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc19 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas ");
        int x = up.nextInt();
        float conteNota=0, somaNota =0;
        int i = 1;
        for(; i <= x; i++){
            System.out.println("Digite a nota "+i);
            somaNota = up.nextFloat();
            
            conteNota += somaNota;
        }
        float media = conteNota / x;
        System.out.println("soma "+ conteNota);
        System.out.println("Media " +media);
    }
} 