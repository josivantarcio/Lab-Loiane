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
public class Exerc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a Base: "); 
        double base = scan.nextDouble();
        
        System.out.println("Digite a Expoente: "); 
        double expo = scan.nextDouble();
        double resultado = 1;
       
        for(int i=0;i<expo;i++){
            resultado *= base;
            System.out.println("dentrodoloop: "+resultado);
        }
        System.out.println(resultado);
        }
    }
