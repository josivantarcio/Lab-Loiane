/*
 *  Altere o programa anterior (Exerc04) permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
Valide a entrada e permita repetir a operação. .
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paisA, paisB;
        int AnoNeces = 0;
        float txAnoA, txAnoB;
        
        System.out.print("Digite os Habitantes do País A : ");
        paisA = scan.nextInt();
        
        System.out.print("Digite os Habitantes do País B : ");
        paisB = scan.nextInt();
        
        System.out.println("Informe a Taxa de Crescimento do País A e B");
        txAnoA = scan.nextFloat();
        txAnoB = scan.nextFloat();
        do{
            if((paisA <= paisB)&&(txAnoA >= txAnoB)){
                paisA += (paisA/100)*txAnoA;
                paisB += (paisB/100)*txAnoB;
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