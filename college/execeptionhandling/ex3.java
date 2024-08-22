package college.execeptionhandling;

import java.util.Scanner;

public class ex3 {

    public static void testdriver()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter two number");
            int a = sc.nextInt();
            int b= sc.nextInt();

            int c= a/b;
            System.out.println("result is  " + c);
        } catch (Exception e) {
            System.out.println("not valid");
        }


        System.out.println("enter two number");
        int d = sc.nextInt();
        int e=d*d;
        System.out.println("square is" + e);
    }

    public static void main(String[] args) {
        testdriver();
    }
    
}
