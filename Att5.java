public class Att5 {
    public static void main(String[] args ) {

       System.out.println("1000 a 2000 / 11 com resto 2");
       for (int i = 1000; i <= 2000; i++) {
           if ((i % 11) == 2) {
               System.out.println(i +" / 11 "+" resta "+(i % 11) );
           }
       }
    }
}
