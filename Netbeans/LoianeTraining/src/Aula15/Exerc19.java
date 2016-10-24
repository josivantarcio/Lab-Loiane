package Aula15;

import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        
        System.out.println("Escreva dois valores");
        float vl1 = calc.nextFloat();
        float vl2 = calc.nextFloat();
        
        int resultado = 0;
        String flag = "v";
        
        System.out.println("Qual Operação deseja executar? (+)Adição (-)Subtração (*)Multiplicação (/)Divisão");
        String sinal = calc.next();
        switch (sinal){
            case "+": resultado = (int)(vl1 + vl2); break;
            case "-": resultado = (int)(vl1 - vl2); break;
            case "*": resultado = (int)(vl1 * vl2); break;
            case "/": resultado = (int)(vl1 /vl2);  break;
            default:
                System.out.println("Entrada Inexistente. Repita a operação");
                flag = "f";
        }
        if(flag.equalsIgnoreCase("v")){
        if(resultado % 2 == 0)
            System.out.print(resultado+ " é Par e... ");
        else 
            System.out.print(resultado+ " é Impar e... ");
        if (resultado > 0)
            System.out.println("Positivo");
        else if (resultado <0)
            System.out.println("Negativo");
        else
            System.out.println("Neutro");
        }
    }
}
