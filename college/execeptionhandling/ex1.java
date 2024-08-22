package college.execeptionhandling;

public class ex1 {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            System.out.println("in try block");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("outside try catch block");
    }
    
}
