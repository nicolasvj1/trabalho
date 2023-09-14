import java.math.BigInteger;

public class atividade7 {

     public static void main(String[] args) {

        BigInteger numero = BigInteger.valueOf(1);
 
        for (int i = 1 ; i <= 64 ; i=i+1){

            numero = numero.multiply(BigInteger.valueOf(2));
          
             System.out.println(numero);
         }
    }
}
