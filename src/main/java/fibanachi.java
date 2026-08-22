import java.util.Scanner;
public class fibanachi {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" "+ c+ " ");
            a = b;
            b = c;
        }
    }
}
