package src;
import java.util.Scanner;
public class Exerc10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Em que turno você estuda? M-Matutino V-Vespertino N-Noturno");
        String turno = scan.next();
        
        switch (turno){
            case "M": case "m":
                System.out.println("Olá! Bom Dia!");break;
            case "V": case "v":
                System.out.println("Olá! Boa Tarde!");break;
            case "N": case "n":
                System.out.println("Olá! Boa Noite!");break;
            default:
                System.out.println("Valor Inválido!");
                        
                            
        }
    }
}
