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

        if ( imc < 18.5 ){
        System.out.println("magresa");
        }
        if ( imc > 18.5 & imc < 24.9){
        System.out.println("Normal");
        }
        if ( imc > 25 & imc < 29.9){
        System.out.println("Sobrepeso");
        }
        if ( imc > 30 & imc < 34.9){
        System.out.println("Obesidade grau 1");
        }
        if ( imc > 35 & imc < 39.9){
        System.out.println("Obesidade grau 2");
        }
        if ( imc > 40 ){
        System.out.println("Obesidade grau 3");
        }

        System.out.println("Seu IMC é: ");
        System.out.println(imc);
        
    }
}
