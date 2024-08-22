
 class rectangle {
    int length;
    int breadth;
    int height;
     void set_value(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
     }
     void show_value(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
     }
    
}
public class runner {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.set_value(3, 5, 6);
        r1.show_value();
    }
}

