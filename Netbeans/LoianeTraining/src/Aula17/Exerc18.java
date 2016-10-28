/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula17;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um numero ");
        int num = scan.nextInt();
        boolean primo = true;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("Não é número primo. "+i);
                primo = false;
            }
        }
        if (primo){
                System.out.println("É Primo");
        }
    }
}
