public class pattern {
//16,24,27,31,33
public static void main(String[] args) {
        
        System.out.println("this is simple pattern");
        
        pattern27(5);
      
         
    }
    static void pattern1(int n){
          for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
            System.out.print("*");
    
             }
            System.out.println();
            
        }
    }
    static void pattern2(int n){
            for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
            System.out.print("* ");
    
             }
            System.out.println();
            
        }
         // for (int i = 1; i <= 9; i++) {
        //    for (int j = 1; j <= 2*i-i; j++) {
        //     System.out.print("*");
    
        //      }
        //     System.out.println();
    }
     static void pattern3(int n){
           for (int i = 1; i <= n; i++) {
           for (int j = n; j >= i; j--) {
            System.out.print("*");
    
             }
            System.out.println();
            
        }
    }
     static void pattern4(int n){
        int count=1;
        for (int i = 1; i <= n; i++) {
            count=1;
           for (int j =1; j <=i; j++) {
            System.out.print(count +" ");
            count++;
    
             }
            System.out.println();
            
        }
    }
     static void pattern5(int n){
    
         
        for (int i = 1; i < 2*n; i++) {
            int c = i > n ? (2*n-i):i;
           for (int j =1; j <=c; j++) {
            System.out.print("*");
    
             }
            System.out.println();
            
        }
    }
    static void pattern6(int n){
        System.out.println("pattren6");
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
    static void pattern7(int n){
        System.out.println("pattren7");
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
            
            
    
             }
             for(int k =1;k<=n-i+1;k++){
              // System.out.print("* "); 
               System.out.print("*"); 
             }
            System.out.println();
    }
    }

     static void pattern8(int n){
        
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
            
    
             }
             for(int k =1;k<=2*i-1;k++){
               System.out.print("*"); 
             }
            System.out.println();
    }
    }

     static void pattern9(int n){
        System.out.println("pattern9");
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i-1; j++) {
            System.out.print(" ");
            
    
             }
             for(int k=1;k<=2*(n-i)+1;k++){
               System.out.print("*"); 
             }
            System.out.println();
    }
}
 static void pattern10(int n){
        System.out.println("pattren7");
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j < n-i+1; j++) {
            System.out.print(" ");
        }
             for(int k =1;k<=i;k++){
              // System.out.print("* "); 
               System.out.print(" *"); 
             }
            System.out.println();
    }
    }
 static void pattern11(int n){
        System.out.println("pattren7");
        for (int i = 1; i <= n; i++) {
           for (int j = n; j > n-i+1; j--) {
            System.out.print(" ");
        
        }
             for(int k =n;k>=i;k--){
               System.out.print("* "); 
              // System.out.print("*"); 
             }
            System.out.println();
    }
    }
 static void pattern12(int n){
        System.out.println("pattren12");
        for (int i = 1; i <= 2*n; i++) {
            int c = i>n? 2*n-i:i-1;
            int h = i>n? i-n:n-i+1;

           for (int j = 1; j<=c; j++) {
            System.out.print(" ");
            
     }
             for(int k =1;k<=h;k++){
                   System.out.print("* ");  
                }
                System.out.println(); 
               
             }
           
    }
    
     static void pattern13(int n){
        System.out.println("pattern13");
        for (int i = 1; i <=n; i++) {

        //    for (int s= 1; s <= n-i; s++) {
        //         System.out.print(" ");
                
        //     }
        
          for(int k=1;k<=2*n-1;k++){
                 if ((i+k==n+1)||(k-i==n-1)||i==n) {
                   System.out.print("*"); 
                    
                 }       
                 else{
              System.out.print(" ");
                 }     
               
             }

             
               System.out.println();
    }
}
     static void pattern14(int n){
        System.out.println("pattern14");
        int start=1;
        
        for (int i = 1; i <=n; i++) {

        //    for (int s= 1; s <= n-i; s++) {
        //         System.out.print(" ");
                
        //     }
        
          for(int k=1;k<=2*n-1;k++){
                 if ((i+k==2*n)||(k-i==0)||i==start) {
                   System.out.print("*"); 
                    
                 }       
                 else{
              System.out.print(" ");
                 }     
               
             }

             
               System.out.println();
    }
}
static void pattern15(int n){
System.out.println("pattren15");
    for (int i = 1; i <= 2*n-1; i++) {
        //this approach is not working

        //int c = i>n ? i-n : n-i;
        // int h =i>n ? 3*n-2*i+5: 2*(2*i-i);
        // for (int sp =1 ; sp <= c; sp++) {
        //     System.out.print(" ");
           
        // }
        //System.out.print("*");
            
         for (int j = 1; j<= 2*n-1; j++) {
            if (i+j==n+1||i+j==3*n-1||j-i==n-1||i-j==n-1) {
                System.out.print("*");
            }
             else{
                  System.out.print(" ");
             }
          
         }
          System.out.println();

    }

}
static void pattern17(int n){
    System.out.println("pattern17");
        for (int i = 1; i <= 2*n; i++) {

            int c = i>n ?i-n :n-i;
            int h= i>n ? 2*n-i : i;    
            for (int j = 1; j <= c; j++) {
             System.out.print("  ");
            }
            for (int coln = h; coln >= 1; coln--) {
                System.out.print( coln + " ");
                
            }
            for (int coln = 2; coln <=h; coln++) {
                System.out.print( coln  + " " );
                
            }
            System.out.println("\n");

            
        }
}
    static void pattern18(int n){
    System.out.println("pattern18");
        for (int i = 1; i <= 2*n; i++) {

            int c = i>n ?4*n-2*i :2*i-2;
            int h= i>n ? i-n : n-i+1; 
            for (int coln = 1; coln <= h; coln++) {
                System.out.print("* ");
                
            }   
             for (int j = 1; j <= c; j++) {
              System.out.print("  ");
            }
            
            for (int coln = 1; coln <=h; coln++) {
                System.out.print( "* " );
                
            }
            System.out.println("\n");

            
        }
 }

static void pattern19(int n){
    
         System.out.println("pattern 19");
        for (int i = 1; i < 2*n; i++) {
            int c = i > n ? 2*n-i:i ;
            int h = i > n ? 2*i-2*n  : 2*n-2*i  ;
           for (int j =1; j <=c; j++) {
            System.out.print("*");
    
             }
             for (int space = 1; space <=h; space++) {
                System.out.print(" ");
             }
           for (int j =1; j <=c; j++) {
            System.out.print("*");
    
             }
            System.out.println();
            
        }
}

     static void pattern20(int n){
        System.out.println("pattern20");
        for (int i = 1; i <= n; i++) {
    
           for (int j =1; j<=n-1; j++) {


            if(i==1 || i==n){
             System.out.print("* ");

            }
            else{
                if(j==1||j==n-1){
            System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            
        }
        System.out.println("\n");
    }
 }
     
 static void pattern21(){
       int count=1;
        for (int i = 1; i <= 5; i++) {
    
           for (int j =1; j <=i; j++) {
            System.out.print(count +" ");
            count++;
    
             }
            System.out.println();
            
        }
    }
    static void pattern22(){
       for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= i; j++) {

            if((i+j)%2==0){
              System.out.print(" 0 ");
              
            }
            else{
              System.out.print(" 1 ");
            }
            
    
             }
            System.out.println("\n");
            
        }
 }
  static void pattern23(int n){
        System.out.println("pattern14");
        //int start=1;
        
        for (int i = 1; i <=n; i++) {


        
          for(int k=1;k<=4*n-3;k++){
                 if ((i+k==n+1)||(k-i==n-1)||(k+i==2*n+2)||k-i==2*n) {
                   System.out.print("*"); 
                    
                 }       
                 else{
              System.out.print(" ");
                 }     
               
             }

             
               System.out.println();
    }
}
static void pattern24(int n){
        System.out.println("pattern24");
        
        for (int i = 1; i <= 2*n; i++) {

            for (int j =1; j<=2*n; j++) {


            if(j==1 || j==2*n||i+j==2*n+1||i-j==0){
             System.out.print("* ");

            }
            else{
                
                    System.out.print("  ");
                }
            
            
            
        }
        System.out.println("\n");
    }
 }
    static void pattern25(int n){
        System.out.println("pattern25");
        
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k<=n-i; k++) {
                System.out.print("  ");
                
            }
    
           for (int j =1; j<=n-1; j++) {


            if(i==1 || i==n){
             System.out.print("* ");

            }
            else{
                if(j==1||j==n-1){
            System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            
        }
        System.out.println("\n");
    }
 }
    static void pattern26(int n){
            System.out.println("pattren26");
      int count=1;
      
        for (int i = 1; i <= n; i++) {
        
           for (int j =n; j >=i; j--) {
            System.out.print(count +" ");
            
    
             }
             count++;
            System.out.println();
            
        }
 }
    static void pattern27(int n){
            System.out.println("pattren27");
      int count=1;
      
        for (int i = 1; i <= n; i++) {

            for (int s = 1; s<=i-1; s++) {
                System.out.print("  ");
                
            }
        
           for (int j =n; j >=i; j--) {
            System.out.print(count +" " );
            count++;
    
             }
           for (int j1 = n; j1>=i; j1--) {
            System.out.print( count + " " );
            count++;
    
             }
             
            System.out.println();
           
            
        }
        // for (int i = n; i >= 1; i--) {
            
        //      System.out.println("");
        // }//not complete
         
 }
    static void pattern28(int n){
        System.out.println("pattren28");
        for (int i = 1; i <= 2*n-1; i++) {
            int c = i>n? i-n:n-i;
            int h = i>n? 2*n-i:i;

           for (int j = 1; j<=c; j++) {
            System.out.print(" ");
            
    
             }
             for(int k =1;k<=h;k++){
                   System.out.print("* ");  
                }
                System.out.println(); 
               
             }
 }
    static void pattern30(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
             System.out.print("  ");
            }
            for (int coln = i; coln >= 1; coln--) {
                System.out.print( coln + " ");
                
            }
            for (int coln = 2; coln <=i; coln++) {
                System.out.print( coln  + " " );
                
            }
            System.out.println();
   
        }
 }

    
        static void pattern32(int n){
         System.out.println("pattern32");
           for (int i = 1; i <= n; i++) {
           char c=69;
            
            for (int k = 1; k<i;k++) {
                c--;
            }
             
           for (int j = 1; j <= i; j++) {
            
            System.out.print(c + " ");
            c++;
             }  
            System.out.println();
                 
        }
}
    static void pattern33(int n){
        char c ='a';
       for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= i; j++) {

                System.out.println(c);
           
        }
             System.out.println("\n");//not complete
    
             }        
     }
 
    static void pattern34(int n){
         System.out.println("pattern34");
            for (int i = 1; i <= n; i++) {
           char c=69;
            
            for (int k = 1; k<i;k++) {
                c--;
            }
             
           for (int j = n; j >= i; j--) {
            
            System.out.print(c + " ");
            c--;
             }
             

             
            System.out.println();
        }
    }
    
    static void pattern35(int n){
         System.out.println("pattren35");
         for (int i = 1; i <= n; i++) {
          int   count =1;
           for (int j =1; j <=i; j++) {
               System.out.print(count);
               count++;

      
            }
           for (int j1 =1; j1 <=2*(n-i); j1++) {
               System.out.print(" ");
        }
           for (int j2=1; j2 <=i; j2++) {
            count--;
               System.out.print(count);
         }
        System.out.println();
     }
   }

   static int pattern36(int n){
    System.out.println("this is pattern 36");
    for (int i = 1; i<= n*5-2; i++) {
        for (int j = 1; j <=n ; j++) {
            if (i-j ==0 ||i-j==2*n-2 ||i-j==3*n-1 || (i%(n+1)==0 &&j==n-1) || i*j==n*5-2) {
                System.out.print("*");
                
            }
            else{
                System.out.print("  ");
            }
            
        }
        System.out.println();
        
    }
    return 0;
   }
}