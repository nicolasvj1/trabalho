import java.util.Scanner;

public class trabalho {
public static void main(String[]args) {
        double peso = 0;
        double altura = 0;
        double imc = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu peso");
        peso = entrada.nextDouble();
        System.out.println("Informe a sua altura");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: ");
        System.out.println(imc);
        
    }
}
