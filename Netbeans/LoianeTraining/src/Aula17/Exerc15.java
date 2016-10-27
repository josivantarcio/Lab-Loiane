/*
 *  A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
    Faça um programa capaz de gerar a série até o n−ésimo termo.
 */
package Aula17;
import java.util.*;
/**
 *
 * @author Josevan
 */
public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um numero");
        
        int num = scan.nextInt();
        int primeiro=0;
        int segundo=1;
        int next;
        int i;
        
        System.out.println(primeiro);System.out.println(segundo);
        for(i=1; i<num;i++){
            next =  primeiro + segundo;
            primeiro = segundo;
            segundo = next;
            
            System.out.println(next);
        }
        
        
            
        }
    }

