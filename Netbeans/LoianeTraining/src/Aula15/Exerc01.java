package Aula15;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        System.out.println("Escolha dois numeros:");
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if (num1 > num2) 
            System.out.println(num1 + " é o maior!");
        else 
            System.out.println(num2 + " é o maior!");
        
    }
}
