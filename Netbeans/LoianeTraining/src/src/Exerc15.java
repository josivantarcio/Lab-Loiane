package src;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        System.out.println("Digite tres numeros");
        Scanner scan = new Scanner(System.in);
        
        float l1 = scan.nextFloat();
        float l2 = scan.nextFloat();
        float l3 = scan.nextFloat();
        
        //Se o tamanho de um lado for maior do que a soma dos outros lados.
        //Não será um triangulo.
        if((l1+l2 < l3) || (l1+l3 < l2) || (l2+l3 < l1))
            System.out.println("Não é um triangulo");
        else{
            //Dois lados iguais e outro diferente.
            System.out.println("É um Triangulo");
            if(((l1 == l2)&& (l1!=l3)) || ((l1 == l3)&& (l2!=l3)) || ((l2 == l3) && (l1!=l2)))
                System.out.println("Triangulo Isósceles");
            else if 
            // Dois lados iguais: Equilátero 
                ((l1 == l2)&& (l1== l3))
                System.out.println("Triangulo Equilátero");
            else
                System.out.println("Triangulo Escaleno");
        }
    }
    
}
