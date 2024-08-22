import java.util.Scanner;

public class fibonaccis {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner fab = new Scanner(System.in);
        System.out.println("enter the value");
        int n = fab.nextInt();
        System.out.print(a) ;
         System.out.print("," );
        System.out.print(b);
         System.out.print("," );
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c);
            System.out.print("," );
            a = b;
            b = c;
        }
        fab.close();

    }
}
