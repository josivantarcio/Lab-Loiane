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
public class Exerc23 {
    public static void main(String[] args) {
        System.out.println("Tabela de Preço");
        Scanner scan = new Scanner(System.in);
        System.out.println("Quant. de Produtos? ");
        int n = scan.nextInt();
        for(int i =1;i<=n; i++){
            System.out.println("Produto "+i+" R$ "+(1.99*i));
        }
    }
  
}
