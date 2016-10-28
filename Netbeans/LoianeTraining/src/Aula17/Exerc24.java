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
public class Exerc24 {
    public static void main(String[] args) {
        System.out.println("Tabela de Preço");
        Scanner scan = new Scanner(System.in);
        System.out.println("Quant. de Produtos? ");
        float preco;
        int n = scan.nextInt();
        
        System.out.println("Informe o preço:");
            preco = scan.nextFloat();
        for(int i =1;i<=n; i++){
            
            System.out.println("Produto "+i+" R$ "+(preco*i));
        }
    }
}

