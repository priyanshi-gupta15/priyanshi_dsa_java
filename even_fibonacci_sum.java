public class even_fibonacci_sum {
  public static void main(String[] args) {
     
  int a = 0;
  int b = 1;
  int i, c,sum=0;
  for(i = 2;i<2000000;i++)
  {
    c = a + b;
    // System.out.println(c);
    if (c % 2 == 0) {
      sum += c;
    }
    a = b;
    b = c;

  }
  System.out.println(sum);
  }
      
 
  
}
