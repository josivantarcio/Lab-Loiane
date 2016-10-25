/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
   mostrando uma mensagem de erro e voltando a pedir as informações
 */
package Aula17;
import java.util.Scanner;
/**
 *
 * @author Josevan
 */
public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tentar=0;
        String login, key;
        
        do{
        System.out.print("Digite seu login:");
        login = input.next();
        
        System.out.print("Digite sua senha: ");
        key = input.next();
        
            if(!(key.equals(login))){
                System.out.println("Seja bem Vindo "+login);
                tentar = 5;   //flag e quantidade de vezes para tentar.
            }else{
                tentar++;
                if(tentar<=3){
                    System.out.println("ERRO, Favor Repetir Login e Senha novamente.");
                    System.out.println("tentativa nr. "+tentar);
                }
                if(tentar >3){
                System.out.println("Você Bloqueou seu acesso. Entrar em contato com o Administrador");
            }
            
            }
        }while(tentar < 4);
        
    }
}