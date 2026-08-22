public class Scannerr {
    public static void main(String[] args) {
        int a = new java.util.Scanner(System.in).nextInt();

        int i=4;
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
