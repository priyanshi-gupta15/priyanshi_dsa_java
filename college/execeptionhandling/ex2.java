package college.execeptionhandling;

public class ex2 {
    public static void main(String[] args) {
        try {
            String s= "priyanshi";
            System.out.println("result = " + s.length());
            System.out.println("in try block");
        } catch (Exception e) {
    
            System.out.println(e.getMessage());
        }
        System.out.println("outside t-c block");
    }
    
}
