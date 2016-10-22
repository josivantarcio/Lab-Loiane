
package src;
import java.util.Scanner;
public class Exerc02 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
    System.out.println("Digite um valor: ");
    int base = scan.nextInt();
    if (base>0)
        System.out.println("Numero Positivo " + base); 
    else if (base ==0) 
        System.out.println("Numero Neutro " + base);
    else 
        System.out.println("Numero Negativo " + base);
      
    }
    
}
