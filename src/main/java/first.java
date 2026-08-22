import java.util.Scanner;

public class first {
    public static void main(String[] args) {


      int a = new Scanner(System.in).nextInt();

        int i=1;
      while (i<=a){
          if (i %2==0) {
              System.out.println("ечетное ");
          }
          else {
              System.out.println("нечетное число");
          }
       i++;
      }


    }
}
