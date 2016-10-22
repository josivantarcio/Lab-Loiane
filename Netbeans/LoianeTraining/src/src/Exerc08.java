/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Apresente o preço das 3 concorrencia...");
        System.out.print("Preço 01 = ");
        float pr1 = scan.nextFloat();
        System.out.print("Preço 02 = ");
        float pr2 = scan.nextFloat();
        System.out.print("Preço 03 = ");
        float pr3 = scan.nextFloat();
        
        if(pr1>pr2 || pr1>pr3)
            if(pr2<pr1 && pr2<pr3)
                System.out.println(pr2+" É o Menor Preço.");
            else
                System.out.println(pr3+" É o Menor Preço.");
        else
            System.out.println(pr1+ " É o Menor Preço.");
        
        if(pr1<pr2 || pr1<pr3)
            if(pr2>pr1 && pr2>pr3)
                System.out.println(pr2+" É o Maior Preço.");
            else
                System.out.println(pr3+" É o Maior Preço.");
        else
            System.out.println(pr1+ " É o Maior Preço.");
            
    }
    
}
