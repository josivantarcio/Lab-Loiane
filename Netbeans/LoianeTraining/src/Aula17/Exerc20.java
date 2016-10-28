/*
 * Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se 
 * a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, 
 * adulta ou idosa, conforme a média calculada.
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("Quantidade de Pessoas");
            
            int pessoas = scan.nextInt();
            int somaIdade = 0, guardaSoma = 0;
            
            for(int i=1;i<=pessoas;i++){
                System.out.print("Digite a Idade da "+i+"ª pessoa. ");
                somaIdade = scan.nextInt();
                
                guardaSoma += somaIdade;
            }            
            float media = guardaSoma/pessoas;
            
            if(media>0 && media<=25){
                System.out.println("Jovens");
            }else if(media>25 && media<=60){
                System.out.println("Adultos");
            }else
            System.out.println("Idosos");
            System.out.println("Media de Idade "+media);
    }
}
