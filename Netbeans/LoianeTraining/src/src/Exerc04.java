package src;
import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Pressione um botão..");
        String lt = scan.next();
        
        switch (lt){
                case "A": case "a":
                case "E": case "e":
                case "I": case "i":
                case "O": case "o":
                case "U": case "u":
                    System.out.println("Vogal");break;
                default:
                    System.out.println("Consoante");
        }
            
    }
}
