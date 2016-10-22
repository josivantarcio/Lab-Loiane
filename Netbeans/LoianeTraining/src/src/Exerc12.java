package src;
import java.util.Scanner;

public class Exerc12
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite quantidade de horas trabalhadas: ");
        int horas = scan.nextInt();
        System.out.print ("Digite valor da hora trabalhada: ");
        float valorHora = scan.nextFloat();
        
        float salarioBruto = horas * valorHora;
        
        float sindicato = (salarioBruto/100)*3;
        float fgts = (salarioBruto/100)*11;
        float inss = (salarioBruto/100)*10;
        float ir = 0;
        float mP=0;
        
        //========= Calculo do IR(Imposto de Renda)
        //========= Abaixo de R$900,00 não é cobrado IR pelo enunciado da questão.
        if(salarioBruto >900 && salarioBruto <=1500){
            mP = 5;
            ir = (salarioBruto/100)*mP;
        }
        if (salarioBruto >1500 && salarioBruto <= 2500){
            mP = 10;
            ir = (salarioBruto/100)*mP;
        }
        if (salarioBruto >2500){
            mP = 20;
            ir = (salarioBruto/100)*mP;
        }
        
        float totalImposto = ir + inss + sindicato ;
       
        System.out.println("==========================================================================");
        System.out.println("Salario Bruto: ("+valorHora+ " * "+horas+ "): R$"+salarioBruto);
        System.out.println("(-) IR (" +mP+ "%)                          : R$"+ir);
        System.out.println("(-) SINDICATO (3%)                          : R$"+sindicato);
        System.out.println("INSS (10%)                                  : R$"+inss);
        System.out.println("FGTS (11%)                                  : R$"+fgts);
        System.out.println("Total de descontos                          : R$"+totalImposto);
        System.out.println("Salário Líquido                             : R$"+(salarioBruto-totalImposto));
    }       
}
