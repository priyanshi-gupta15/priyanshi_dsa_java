package oops.abstractClassAndMethod;
//an abstract class without any abstract method

abstract class teacher{

    void greeting()
    {
        System.out.println("hello everyone i am an abstarct class");
        // here greeting is not a abstract method so we written a body of this
    }

}

class classteacher extends teacher{
    //nothing will be intialix]ze or declare

}



public class ex3 {
    public static void main(String[] args) {
        classteacher t1 = new classteacher();
        t1.greeting();// accesing function from parent class
        
    }
    
}
