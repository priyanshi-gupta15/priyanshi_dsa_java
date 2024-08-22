package oops;
import java.util.ArrayList;
import java.util.Collections;

public class array_to_int {
    public static void main(String[] args) {
     ArrayList<Integer> ot = new ArrayList<>(100);  
    
    int[] num ={9,9,9,9,9,9,9,9};
    int k=1;
    int l= num.length;
    int sum =0;
    for(int i=0; i<l;i++)
    {
        sum+=num[i];
        if (i != l - 1) {
            sum = sum * 10;
        }
    }
    int total = sum+k;
    int ans=total;
    while(ans>0)
    {
        int rem = ans%10;
        ot.add(rem);
        ans/=10;

    }
    Collections.reverse(ot);
    System.out.println(ot);
} 
    
}
