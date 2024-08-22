public class pattern9 {
    

    public static void main(String[] args) {
        System.out.println("this is right triangle pattern");
        int n=7;
        {
        
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
            
    
             }
             for(int k =1;k<=i;k++){
               System.out.print("*"); 
             }
            System.out.println();
            
        }
    }
        {
          n  =n-1;
        for (int i = 1; i <= n; i++) {
           for (int j = n; j >n-i; j--) {
            System.out.print(" ");
            
    
             }
             for(int k =n;k>=i;k--){
               System.out.print("*"); 
             }
            System.out.println();
            
        }
        }
         
    }
    
}

