 class local_var {
  int a;
  int b;  
  static int k;
}
 public class driver{
    public static void main(String[] args) {
        int i=0;
        local_var d1 = new local_var();
        System.out.println(d1.a);
        System.out.println(local_var.k);
        System.out.println(i);
    }
}
