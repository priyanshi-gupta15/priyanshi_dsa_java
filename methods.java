import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name ="priyanshi . gupta";
        String arr[] = name.split("");
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(name.toCharArray())
        );
        
        System.out.println(name.toUpperCase());
        System.out.println ( Arrays.toString(name.split(" ")));
        System.out.println(name.trim());
        System.out.println(name.replace(".","[.]"));
    }
}
