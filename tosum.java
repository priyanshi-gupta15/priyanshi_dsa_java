
public class tosum {
    public static void main(String[] args) {
String y ="hello";
String[] c = y.split("l");
System.out.println(c);
       String[] arr = {"a","b","g","a","b"}; 
       String word ="ab";
       int count =0;
       for (int i = 0; i < arr.length; i++) {
            String sum="";

            if (i==arr.length-1) {
            break;
             }
        sum = arr[i]+arr[i+1]+sum;
         if( word.equals(sum)){
            count++;
         }
    //     if(sum==word)
    //     {
    //         count++;
    //     }
    //    System.out.println(sum);
    
       
       }
         System.out.println(count);
    }
 
 
    
}
