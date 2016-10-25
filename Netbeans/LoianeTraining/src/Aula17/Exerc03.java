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
        System.out.print("Digite o nome : ");
        nome = xx.nextLine();
        
        if(nome.length()>=3){
            flag = true;
        }else{
            System.out.println("Quantidade de menor que permitido(3), favor repetir");
            flag = false;
        }
        }while(!flag);
        
        
        //Tratamento da Idade
        do{
        System.out.print("Digite a idade : ");
        idade = xx.nextInt();
        
        if(idade > 0 && idade <= 150){
            flag = true;
        }else{
            System.out.println("Valor Inválido, favor repetir");
            flag = false;
        }
        }while(!flag);
        
                
        //Tratamento do Salário
        do{
        System.out.print("Salário : ");
        salario = xx.nextFloat();
        
            if(salario>0){
                flag = true;
            }else{
                System.out.println("Salário deve ser maior que 0");
                flag = false;
            }
        }while (!flag);
        
        //Tratamento de Sexo
        do{
        System.out.print("Sexo (M-Masculino F-Feminino)");
        sexo = xx.next();
            if((sexo.equalsIgnoreCase("m"))||(sexo.equalsIgnoreCase("f"))){
                flag = true;
            }else{
                System.out.println("ERRO, Repetir Operação com \"M\" ou \"F\"!");
                flag = false;
            }
        }while(!flag);
        
        
        //Tratamento do Estado Civil
        do{
        System.out.print("Estado Civil: S-Solteiro C-Casado V-Viúvo D-Divórciado : ");
        estCivil = xx.next();
            if((estCivil.equalsIgnoreCase("S")||(estCivil.equalsIgnoreCase("C")
             ||(estCivil.equalsIgnoreCase("V")||(estCivil.equalsIgnoreCase("D")))))){
                flag = true;
            }else{
                System.out.println("ERRO, Repetir Operação com \"S\" ou \"C\" ou \"V\" ou \"D\"!");
                flag = false;
            }
        }while(!flag);
        System.out.println("======= RESPOSTAS ======");
        System.out.println("O nome é  : " + nome);
        System.out.println("Idade é   : " +idade);
        System.out.println("Salário é : " + salario);
        switch(sexo){
                    case "m": case "M": System.out.println("sexo : Masculino");break;
                    case "f": case "F": System.out.println("sexo : Feminino");break;
                }
        switch(estCivil){
                    case "s": case "S": System.out.println("Est. Civil : Solteiro");break;
                    case "c": case "C": System.out.println("Est. Civil : Casado");break;
                    case "v": case "V": System.out.println("Est. Civil : Viúvo");break;
                    case "d": case "D": System.out.println("Est. Civil : Divórciado");break;
                }
    }
}