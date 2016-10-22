/*
Uma fruteira está vendendo frutas com a seguinte tabela de preços: 
                      Até 5 Kg           Acima de 5 Kg  
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg  
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg 

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler 
a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
package src;

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float valorTotal = 0, desconto=0;
        
        System.out.print("Quantidade de Morango(Kg): ");
        float quantMorango = scan.nextFloat();
        
        System.out.print("Quantidade de Maçã(Kg): ");
        float quantMaca = scan.nextFloat();
        
        float totalFrutas = quantMaca + quantMorango;
        
        if(totalFrutas <= 5){
            valorTotal = (float)((quantMorango*2.5)+(quantMaca*1.8));
        }else if (totalFrutas > 5){
            valorTotal = (float)((quantMorango*2.2)+(quantMaca*1.5));
        }
        
        if(totalFrutas > 8 || valorTotal>25){
            desconto = ((valorTotal/100)*10);
            valorTotal = valorTotal - desconto;
        }
        System.out.println("---------------------");
        System.out.println("Quant. Morango(Kg):  "+quantMorango);
        System.out.println("Quant. Maçã(Kg):     "+quantMaca);
        System.out.println("================:(Kg)"+totalFrutas);
        System.out.println("=================:(-)"+ desconto);
        System.out.println("Valor Pago(R$):      "+valorTotal);
    }
}
