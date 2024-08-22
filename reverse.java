public class reverse {
 public static void main(String[] args) {
    System.out.println("this is reverse of no");
int num =13454;
int ans =0;
while (num>0) {
    int rem = num%10;
    ans =ans*10+rem;
    num=num/10;
    
}
System.out.println(ans);







 }   
}
