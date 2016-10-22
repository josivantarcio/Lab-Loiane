package src;
import java.util.Scanner;
public class Exerc09 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
        System.out.println("Entre com Três Números aleatórios: ");
        
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
        
        //DECRESCENTE
        //01
        //a1 a2 a3
        if((a1>a2 && a1>a3)&&(a2>a3))
            System.out.println("A ordem é: "+a1+" > "+a2+ " > "+a3);
        //a1 a3 a2
        else if ((a1>a3 && a1>a2)&&(a3>a2))
            System.out.println("A ordem é: "+a1+" > "+a3+ " > "+a2);
        //a2 a1 a3
        else if((a2>a1 && a2>a3)&&(a1>a3))
            System.out.println("A ordem é: "+a2+" > "+a1+ " > "+a3);
        //a2 a3 a1
        else if((a2>a1 && a2>a3)&&(a1<a3))
            System.out.println("A ordem é: "+a2+" > "+a3+ " > "+a1);
        //a3 a1 a2
        else if((a3>a1 && a2<a3)&&(a1>a2))
            System.out.println("A ordem é: "+a3+" > "+a1+ " > "+a2);
        //a3 a2 a1
        else//((a3>a1 && a3>a2)&&(a2>a1))
            System.out.println("A ordem é: "+a3+" > "+a2+ " > "+a1);
    }
}
