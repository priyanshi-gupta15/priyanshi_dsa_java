package oops.abstractClassAndMethod;
//We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract

abstract class A{
     abstract class B {
       abstract  void design();
     }
}

class C extends A{
    class  D extends B{
        void design()
        {
           System.out.println("i am an  child of greatest class" );
        }; 

    }
}

public class ex5 {
    public static void main(String[] args) {

        C obj = new C();
        C.D obj2 = obj.new D();
        //D obj = new D(); DIRECT NOT APPLICABLE

        obj2.design();
        
    }
    
}
