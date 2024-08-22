package oops;

public class wrapper {
    public static void main(String[] args) {
        //=================================================================//
   
        //======== in this int is primitive datatype and in java there is no pass by reffernce only pass by value so in that case we use wrraper claases  =========//

        //=========in this case pointer is not passes only value is passed thats why it is not swap the value of original refernce variable ==========//
        
        //=================================================================//
        int a= 10;
        int b=30;
        swap(a, b);
        System.out.println( a +" " + b);


       // with wrappper class
        Integer A= 10;
        Integer B=30;
        swap(A, B);
        System.out.println( A +" " + B);
        
    }

    static void swap(Integer a, Integer b)
    {
        Integer temp = a;
        a=b;
        b=temp;
        
    }
   //=================================================================//
   //=================================================================//

    
}
