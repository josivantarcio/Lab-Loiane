package Aula15;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);
        
        System.out.println("Digite tres numeros...");
        int n1 = ss.nextInt();
        int n2 = ss.nextInt();
        int n3 = ss.nextInt();
        
        if (n1>=n2 && n1>=n3)
            System.out.println(n1 + " n1 é o Maior");
        else if (n2>=n1 && n2>=n3)
            System.out.println(n2 + " n2 é o Maior");
        else if (n1<=n3 && n2<=n3)
            System.out.println(n3+ " n3 é o Maior");
        
    }
}
