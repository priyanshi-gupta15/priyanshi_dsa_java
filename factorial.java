import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int f= 1;
        Scanner fac = new Scanner(System.in);
        System.out.println("enter the number");
        int I = fac.nextInt();
        for (int i = 1; i <= I; i++) {

            f = f * i;

        }
        System.out.println(f);
        fac.close();
    }
}
