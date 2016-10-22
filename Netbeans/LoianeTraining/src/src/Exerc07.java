package src;

import java.util.Scanner;
public class Exerc07 {
    public static void main(String[] args) {
        System.out.println("Digite três números...");
        Scanner scan = new Scanner(System.in);
        
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        
        if (n1<=n2 && n1<=n3)
            if (n2>n1 && n2>n3)
                System.out.println(n2+" é o Maior");
            else
                System.out.println(n3+" é o Maior");
        else System.out.println(n1+" é o Maior");
        
        if (n1>n2 && n1>n3)
            if(n2<n1 && n2<n3)
                System.out.println(n2+" é o Menor");
            else
                System.out.println(n3+" é o Menor");
        else
            System.out.println(n1+" é o Menor");
            
    }
}
