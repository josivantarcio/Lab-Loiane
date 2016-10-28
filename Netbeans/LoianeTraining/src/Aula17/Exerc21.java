/*
 *  Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas 
 *  e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc21 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        
        int guardAluno = 0;
        
        System.out.print("Digite a quantidade de turmas: ");
        int turma = scan.nextInt();
        boolean flag;
        for(int i = 1; i <= turma; i++){
            do{
                System.out.println("Digite a quantidade da turma "+i);
                int quantAlunos = scan.nextInt();

                if(quantAlunos > 40){
                    System.out.println("Limite de Alunos proibido - REPITA OPERAÇÃO");
                    flag = true;
                }else{
                    guardAluno += quantAlunos;
                    System.out.println("Turma "+i+" - Quantidade "+quantAlunos);
                    flag = false;
                }
            }while(flag);
        }
        float media = guardAluno / turma;
        System.out.println("A Média de Alunos por turma é: "+media);
        
    }
}
