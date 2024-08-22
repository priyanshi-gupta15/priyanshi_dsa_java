public class pattern8 {
    

    public static void main(String[] args) {
        System.out.println("this is right triangle pattern");
        int n=7;
        int j;
        for (int i = 1; i < 2*n; i++) {

            if(i<=n){
           for ( j = 1; j <=i; j++) {
            
                System.out.print("*");
                }
            }
            else{
    
                
                  for ( j = 1 ; j < ((2*n)-i+1) ; j++) {
            
                System.out.print("*");
               }
            }
                 System.out.println();

         }

     }
           
    }
         
    


