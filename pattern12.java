public class pattern12 {

    public static void main(String[] args) {
      // System.out.print(patt1());
       System.out.print(patt3());

    }
    static int patt1(){
         System.out.println("this is triangle num pattern");
        int n=5;
        char c ='A';
        for (int i = 1; i <=n; i++) {
           for (int j =1; j <=i; j++) {
            System.out.print(c + " ");
            c++;
    
             }
            System.out.println();
            
    }
       return 0;
        }
    static int patt2(){
         System.out.println("this is triangle num pattern");
        int n=5;
        char c ='A';
        for (int i = 1; i <=n; i++) {
            c='A';
           for (int j =1; j <=i; j++) {
            System.out.print(c + " ");
            c++;
    
             }
            System.out.println();
            
    }
       return 0;
        }
         static int patt3(){
         System.out.println("this is triangle num pattern");
        int n=5;
        char c ='A';
        for (int i = 1; i <=n; i++) {
            
           for (int j =1; j <=i; j++) {
            System.out.print(c + " ");
            
    
             }
            System.out.println();
            c++;
            
    }
       return 0;
        }
        
    }
         
    
    


    



