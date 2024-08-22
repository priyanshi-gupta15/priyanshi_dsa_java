import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        float SI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principal");
        float P = sc.nextFloat();
        System.out.print("Enter the value of rate of intrest");
        float R = sc.nextFloat();
        System.out.print("Enter the value of time in year");
        float T = sc.nextFloat();
        SI = (P * R * T) / 100;
        System.out.println(SI);
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number of times intrest is compound per year");
       
        //A = (1 + (R / N)) ^ (N * T);
        sc.close();

    }
}
 