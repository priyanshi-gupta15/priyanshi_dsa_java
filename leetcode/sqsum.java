package leetcode;

public class sqsum {
    public static void main(String[] args) {
        int c=8;
        System.out.println(sum(c));
    }
    public static boolean sum(int c)
    {
        int a=0;
 int b=0;
  if (c == 0 || c == 1) {
            return true;
        }

        int start = 1;
        int end = c;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == c) {
                return true;
            } else if ((long) mid * mid > (long) c) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

         a = end;
         int bb = b*b;
         bb = c-(a*a);
         if((a*a) + (bb) == c)
         {return true;}

         return false;

        
    }
    
}
