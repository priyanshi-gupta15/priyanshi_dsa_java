import java.util.Scanner;

public class max {
   public static void main(String[] args) {
System.out.println("enter the numebr");
       try (Scanner in = new Scanner(System.in)) {
           int a =in.nextInt();
           int b =in.nextInt();
//int c =in.nextInt();


int max = Math.max(a, b);

System.out.println(max);
       }

   } 

}
