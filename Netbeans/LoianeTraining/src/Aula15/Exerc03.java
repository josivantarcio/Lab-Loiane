package Aula15;
import java.util.*;
public class Exerc03 {
    public static void main(String[] args) {
        System.out.println("Digite sexo M-Masculino F-Feminino");
        Scanner scan = new Scanner(System.in);
        
        String sexo = scan.next();
        /*switch (sexo) {
            case "M":
            case "m":
                System.out.println("Sexo Masculino");
                break;
            case "F":
            case "f":
                System.out.println("Sexo Feminino");
                break;
            default:
                System.out.println("Sexo Inválido");
                break;
        }*/
        if(sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo Masculino");
        }else if(sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo Feminino");
        }else
            System.out.println("Sexo Inválido");
    }
    
}
