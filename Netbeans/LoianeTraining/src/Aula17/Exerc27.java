/*
 *  O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto 
indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das 
temperaturas
 */
package Aula17;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc27 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        float menorTemp=Integer.MAX_VALUE, maiorTemp=Integer.MIN_VALUE;
        float gravaTemp_m=0, gravaTemp_M=0;
        boolean flag = true;
        float temp=0, somaTemp=0;
        int contaTempo=0;
        
            while(flag){
                System.out.print("Digite Temperatura °C ");
                temp = scan.nextFloat();
                somaTemp += temp;
                
                if(temp>maiorTemp){
                    maiorTemp = temp;
                    gravaTemp_M++;
                }
                if(menorTemp>temp){
                    menorTemp = temp;
                    gravaTemp_m++;
                }
                    if(somaTemp >= 100){
                        flag = false;
                    }else{
                        flag = true;
                    }
                contaTempo++;    
            }
            float media=0;
            System.out.println(" ");
            System.out.println("A Maior temperatura: "+maiorTemp);
            System.out.println("A Menor temperatura: "+menorTemp);
            System.out.println("A Media temperatura: "+ (media = (somaTemp /contaTempo)));
            System.out.println("Quantidade de Temperatura analisada: "+contaTempo);
    }
}
