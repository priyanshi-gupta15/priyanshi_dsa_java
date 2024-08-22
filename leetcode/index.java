package leetcode;

public class index {
    public static void main(String[] args) {
      String haystack = "sadsongsad";
      String needle = "song";
      System.out.println(count(haystack , needle));
       
        

    }
    public  static int count (String haystack , String needle)
    {
        for(int i=0;i<haystack.length()-needle.length()+1;i++)
        {  String word = haystack.substring(0+i,needle.length()+i);
            if(needle.equals(word))
            {
                return i;
            }
        }
        return -1;

    }
    
}
