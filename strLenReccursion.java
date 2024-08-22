

public class strLenReccursion {
    /* Driver program to test above function */
    public static void main(String[] args) {

        String str = "priyanshi";
        System.out.println(recLen(str));
    }


    /* Function to calculate length */
    private static int recLen(String str) {

        // if we reach at the end of the string
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1))+1;
    }

   
}
    
