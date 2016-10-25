/*
Faça um programa que leia e valide as seguintes informações: 
a. Nome: maior que 3 caracteres; 
b. Idade: entre 0 e 150; 
c. Salário: maior que zero; 
d. Sexo: 'f' ou 'm'; 
e. Estado Civil: 's', 'c', 'v', 'd'; 
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc03 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = xx.nextLine();
        
        System.out.print("Digite a idade: ");
        int idade = xx.nextInt();
        
        System.out.print("Salário : ");
        float salario = xx.nextFloat();
        
        System.out.print("Sexo (M-Masculino F-Feminino)");
        String sexo = xx.next();
        
        System.out.print("Estado Civil: S-Solteiro C-Casado V-Viuvo D-Divórciado");
        String estCivil = xx.next();
        
    }
}