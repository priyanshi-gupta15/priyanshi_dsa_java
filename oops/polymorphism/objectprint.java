package oops.polymorphism;

public class objectprint {
    int num;
    

    public objectprint(int num) {
        this.num = num;
    }

    public String toString()
    {
        return "objectprint{num=" + num + "};";
    }


    public static void main(String[] args) {
        objectprint obj = new objectprint(56);
        System.out.println(obj);
        
    }
    
}
