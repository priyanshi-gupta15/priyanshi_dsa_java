package string_buffer_class;
import java.text.DecimalFormat;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        //constructor 1 ;
        
        StringBuffer sb = new StringBuffer(30 + "hyy");
        //constructor 2;
        StringBuffer sb1 = new StringBuffer("30");
        //constructor 3 ;
        StringBuffer sb2 = new StringBuffer("hyyy");

        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
        sb.append("hyyy");
        sb.reverse();
        System.out.println(sb);

        sb.replace(1, 6, "utkarsh");
        System.out.println(sb);

        Random random = new  Random();
        System.out.println(random.nextFloat());

        int n =20;
        String name = Randomstring.generate(n);
        //this will call the randomstring file and give size of varible 
        //store in name and then print using random function 
        System.out.println(name);




// Class DecimalFormat
//     java.lang.Object
//      java.text.Format
//       java.text.NumberFormat
//        java.text.DecimalFormat

DecimalFormat db = new DecimalFormat("0.000");
System.out.println(db.format(7.2));



    }
    
}

