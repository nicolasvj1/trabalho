import java.util.Scanner;

public class Att2 {
    
    public static void main(String[] args ) {
        int idade = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode ser doador de sangue");
        } else {
            System.out.println("Não pode ser doador de sangue");
        }




        
    }


}
