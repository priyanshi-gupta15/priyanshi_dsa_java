public class lcm {
    public static void main(String[] args) {
        System.out.println(lcmm(4, 5));
    }

    static int lcmm(int a , int b){

        for (int i = 2; i <=(a*b); i++) {
            if (a%i==0 && b%i==0) {
                System.out.println(i);
                
            }
           
        }
     return 0;
    }
    
}
