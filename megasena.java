import java.util.Random;

public class megasena {

    public static void main(String[] args) {
        Random generate = new Random();

//      int i = 0;
//      while(i < 6) {                          //Enquanto i for menor que 6, um número aleatório até 60 será gerado
//          int number = generate.nextInt(60);
//          System.out.println(number);
//          i++;
//      }

        for(int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
     // O comando usando o for tem a mesma finalidade do while

    }
}
