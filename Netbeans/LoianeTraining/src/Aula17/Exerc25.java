/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. 
Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido 
de valores referentes aos preços das mercadorias. 
Um valor zero deve ser informado pelo operador para indicar o final da compra. 
O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então 
calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar 
a próxima compra. A saída deve ser conforme o exemplo abaixo:  */

package Aula17;

import java.util.Scanner;

/**
 *
 * @author Josevan
 */
public class Exerc25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int cod ;
        float preco = 0, somaPreco=0;
        boolean novaVenda = false;
        boolean fPgto = false;
        int novoItem=1;
        do{        
               
                do {
                    System.out.println("Digite Produtos");
                    cod = scan.nextInt();
                    if(cod == 1){
                       preco = 1.99f;
                       System.out.println("Produto XX  R$"+preco);
                       novoItem = 1;
                    }else if(cod == 2){ 
                       preco = 5.99f;
                       System.out.println("Produto YY  R$"+preco);
                       novoItem = 1;
                    }else if(cod == 3){
                        preco = 4.50f;
                        System.out.println("Produto ZZ  R$"+preco);
                        novoItem = 1;
                    }else if(cod == 4){
                        preco = 20.21f;
                        System.out.println("Produto AA  R$"+preco);
                        novoItem = 1;
                    }else if(cod == 5){
                        preco = 8.64f;
                        System.out.println("Produto BB  R$"+preco);
                        novoItem = 1;                     
                    }else if(cod == 0){
                        System.out.print("Deseja Finalizar a venda? (S)Sim  (N)Não ");
                        String finalizar = scan.next();
                        if(finalizar.equalsIgnoreCase("S")){
                            novoItem=0;
                        }else{
                            novoItem=1;
                        }
                        
                    }
                    somaPreco += preco;
                
                }while(novoItem==1);   
                
            System.out.println("=============================================");
            
            
            System.out.println("Total.............: R$"+somaPreco);
            
                do{    
                System.out.println("Forma de Pagamento D-Dinheiro C-Cartão X-Cheque V-Vale");
                String formaPgto = scan.next();
                    switch(formaPgto){
                        case "D": case "d": System.out.println("Forma de Pagamento........: Dinheiro");fPgto=false;break;
                        case "C": case "c": System.out.println("Forma de Pagamento........: Cartão");fPgto=false;break;
                        case "X": case "x": System.out.println("Forma de Pagamento........: Cheque");fPgto=false;break;
                        case "V": case "v": System.out.println("Forma de Pagamento........: Vale");fPgto=false;break;
                        default: System.out.println("Forma de Pagamento Errada");fPgto=true;
                    }
                }while(fPgto);
            System.out.print("Valor Recebido..........: ");
            float valorPago = scan.nextFloat();

            float diferenca = valorPago-somaPreco;
            System.out.println("Troco........: "+diferenca);
            System.out.println(" ");
            System.out.println("CAIXA LIVRE");
            
            novaVenda = true;
            
            
        }while(novaVenda);
    }
}
