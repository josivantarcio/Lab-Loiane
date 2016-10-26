/*
 *  Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares
 *  e a quantidade de números impares
 */

package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc14 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        
        int cont=0,contPar = 0,contImpar = 0;
        for (int i = 1; i<=10;i++){
            System.out.println("Digite o nr "+i);
            cont= ss.nextInt();
        
            if(cont % 2 ==0){
                contPar++;
            }else{ 
                contImpar++;
            }
        }
        System.out.println("Pares: "+contPar);
        System.out.println("Impares:"+contImpar);
    }
}
