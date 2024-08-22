import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a + b) % 2 == 0) {
            System.out.println("it is even no");
        } else {
            System.out.println("it is odd no");
        }
        sc.close();

    }
}
