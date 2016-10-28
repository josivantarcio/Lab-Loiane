/*
 * . Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e 
o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc22 {
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        System.out.print("Quantos CD possui? ");
        int quantCD = sca.nextInt();
        float precoCD, totalCD=0; 
        for(int i = 1; i <= quantCD; i++){
            System.out.println("Valor do CD "+i);
            precoCD = sca.nextFloat();
            totalCD += precoCD;
        }
        float precoMedio = totalCD / quantCD;
        System.out.println("Preço Médio : R$"+precoMedio);
        System.out.println("Valor Total : R$"+totalCD);
        
    }
}
