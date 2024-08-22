package oops;

 class student {

    int roll;
    String name;
    float no;

    student(){
        //calling a constructor from another constructor;
        //internally : new student (13,"hyy priyanshi",100.0f);
        this(13,"hyy priyanshi",100.0f);
    }
    student(int roll , String name , float no)
    {
        this.roll=roll;
        this.name=name;
        this.no=no;
    }

    
}

public class oop1 {
    public static void main(String[] args) {
        
        student n1 = new student();//creating new object  and n1 is refrence variable
        System.out.println(n1.name);
        
        // memory allocation 
        student b1= new student();
        student b2 = b1;
        b1.name="how are you"; // already intialize the variable name in student class;
        System.out.println(b2.name);

        
    }

    
}
