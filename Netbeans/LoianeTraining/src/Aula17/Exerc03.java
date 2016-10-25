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
        String nome, estCivil, sexo;
        int idade;
        float salario;
        
        boolean flag = true;
        
        
        //Tratamento do Nome
        do{
        System.out.print("Digite o nome: ");
        nome = xx.nextLine();
        
        if(nome.length()>=3){
            System.out.println("O nome é " + nome);
            flag = true;
        }else{
            System.out.println("Quantidade de menor que permitido(3), favor repetir");
            flag = false;
        }
        }while(!flag);
        
        
        //Tratamento da Idade
        System.out.print("Digite a idade: ");
        idade = xx.nextInt();
        
        if(idade > 0 && idade < 150){
            System.out.println("Idade é : "+idade);
        }else{
            System.out.println("Valor Inválido, favor repetir");
            flag = false;
        }
                
        System.out.print("Salário : ");
        salario = xx.nextFloat();
        if(salario<0){
            System.out.println("Erro na Digitação do Salário");
            flag = false;
        }else{
            System.out.println("Salário é: "+salario);
        }
        
        
        System.out.print("Sexo (M-Masculino F-Feminino)");
        sexo = xx.next();
        //if(sexo.equalsIgnoreCase("m")
        
        
        System.out.print("Estado Civil: S-Solteiro C-Casado V-Viuvo D-Divórciado");
        estCivil = xx.next();
        
       
    }
}