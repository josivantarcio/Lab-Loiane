package src;
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Salário: ");
        float salario = scan.nextFloat();
        float salarioAtual = 0; 
        int p = 0;
        
        if(salario <= 280){
            p = 20;
            salarioAtual = ((salario/100)*p + salario);
        }
        if (salario > 280 && salario <=700){
            p = 15;
            salarioAtual = ((salario/100)*p + salario);
        }
        if (salario > 700 && salario <= 1500){    
            p = 10;
            salarioAtual = ((salario/100)*p + salario);
        }
        if (salario > 1500){
            p = 5;
            salarioAtual = ((salario/100)*p + salario);
        }
        
       
        System.out.println("Salário Antes do reajuste....: " + salario);
        System.out.println("Percentual Aplicado..........: " + p + "%");
        System.out.println("Valor do Aumento.............: " +(salario/100)*p);
        System.out.println("Salário Ajustado para........: " + salarioAtual);
        
    }
}
