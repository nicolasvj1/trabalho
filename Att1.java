import java.util.Scanner;

public class Att1 {

     public static void main(String[] args) {

    double valor1 = 0;
    double valor2 = 0;
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o 1° valor: ");
    valor1 = entrada.nextDouble();
    System.out.println("Informe o 2° valor: ");
    valor2 = entrada.nextDouble();

    if (valor1 > valor2) {
         System.out.println("1° valor é o maior e o 2° valor o menor");   
    } else if ( valor2 > valor1) {
         System.out.println("2° valor é o maior e o 1° valor o menor");
    } else {
         System.out.println("Os valores são iguais");
    }







     }

}