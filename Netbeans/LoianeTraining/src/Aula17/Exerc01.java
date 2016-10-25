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
public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i; //flag
        
        do{
            System.out.println("Digite uma nota: ");
            int nota = scan.nextInt();
      
            if(nota >= 0 && nota <=10){
                i=2;
                System.out.println("Valor: "+nota);
                
            }else{
                System.out.println(nota+" valor invalido, repita a operação!");
                i=3;
            }
        }
        while(i!=2);
    }
}
