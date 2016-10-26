/*
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse 
ou iguale a população do país B, mantidas as taxas de crescimento.
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paisA, paisB;
        int AnoNeces = 0;
        
        System.out.print("Digite os Habitantes do País A : ");
        paisA = scan.nextInt();
        
        System.out.print("Digite os Habitantes do País B : ");
        paisB = scan.nextInt();
        
        do{
            if(paisA <= paisB){
                paisA += (paisA/100)*3;
                paisB += (paisB/100)*1.5;
                AnoNeces++;
            }else{
                System.out.println("Pais B é menor que País A");
                System.out.println("tempo de "+AnoNeces);
            }
        }while(paisA <= paisB);
        
        System.out.println("A "+ paisA);
        System.out.println("B "+ paisB);
        System.out.println("O tempo Necessário para igualhar suas populações será de "+(int) AnoNeces + " Anos");
    }
}