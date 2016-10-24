/*
 O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: 
                        Até 5 Kg           Acima de 5 Kg  
o File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg  
o Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg  
o Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg 

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. 
Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do 
desconto e valor a pagar.
 */
package Aula15;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        float totalCompra = 0, precoCarne = 0;
        float desconto = 0, valorPagar = 0;
                
               
        System.out.print("Escolha tipo de carne. (F)File Duplo (A)Alcatra (P)Picanha : ");
        String tipoCarne = scan.nextLine();
                
        System.out.print("Quantidade de "+tipoCarne+"(Kg): ");
        float quantCarne = scan.nextFloat();
        
        switch (tipoCarne){
            case "F": case "f":
                tipoCarne = "File Duplo";
                if(quantCarne <= 5){
                    precoCarne = 4.9f;
                    totalCompra = (float)(quantCarne*precoCarne);
                }else if(quantCarne > 5){
                    precoCarne = 5.8f;
                    totalCompra = (float)(quantCarne*precoCarne);
                };
            break;
                
            case "A": case "a":
                tipoCarne = "Alcatra";
                if(quantCarne <= 5){
                    precoCarne = 5.9f;
                    totalCompra = (float)(quantCarne*precoCarne);
                }else if(quantCarne > 5){
                    precoCarne = 6.8f;
                    totalCompra = (float)(quantCarne*precoCarne);
                };
            break;
            
            case "P": case "p":
                tipoCarne = "Picanha";
                if(quantCarne <= 5){
                    precoCarne = 6.9f;
                    totalCompra = (float)(quantCarne*precoCarne);
                }else if(quantCarne > 5){
                    precoCarne = 7.8f;
                    totalCompra = (float)(quantCarne*precoCarne);
                };
            break;
        
        }
        
        
        System.out.println("Tipo de Pagamento: (D)-Dinheiro (C)-Cheque (T)-Cartão Tabajara");
        String tipoPgto = scan.next();
        
        
        switch (tipoPgto){
            case "D": case "d": 
                tipoPgto = "Dinheiro";
                break;
            case "C": case "c": 
                tipoPgto = "Cheque";
                break;
            case "T": case "t": 
                tipoPgto = "C.Tabajara";
                desconto = ((totalCompra/100)*5);
                break;
            default:
                tipoPgto = "Dinheiro";
                break;
        }
        
        valorPagar = totalCompra - desconto;
        
        
        System.out.println("+                   LOJA TABAJARA 007             ");
        System.out.println("+                     CUPOM FISCAL                ");
        System.out.println("+                                                 ");
        System.out.println("+ PROD.             QUANT.                  R$    ");
        System.out.println("+ "+tipoCarne+"        "+quantCarne+"                      "+totalCompra+"");
        System.out.println("+                                                 ");
        System.out.println("+-------------------------------------------------");
        System.out.println("+                                 desconto(-)"+desconto);
        System.out.println("+FORMA DE PAGAMENTO:................"+tipoPgto);
        System.out.println("+TOTAL A PAGAR..............................:"+valorPagar);
    }
}
