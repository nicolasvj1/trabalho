import java.util.Scanner;

public class Att4 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println("Tabuada do "+ numero);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i +" x " + numero + " = " + (i * numero));



        }





    }    
}
