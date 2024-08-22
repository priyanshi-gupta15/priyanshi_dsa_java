package oops.abstractClassAndMethod;

//  example 2 - Abstract Class having constructor, data member, and methods

abstract class human{

   int age;
    
       human(int age) {
        this.age=age;
        System.out.println("i am an human");// automatic call
       // System.out.println(AGE);

       
    }

    abstract void occupation();

    void display(){
        
        System.out.println("we are indian");
    }

}

class female extends human{
     void occupation()
    {
      System.out.println("i am a engg");
    }
    public female(int age)
   {
    super (age);  //  difining the age of parent by child
    System.out.println(age);

   }



} 
public class example2 {
    public static void main(String[] args) {
        female f1 = new female(90);
        f1.display();
        f1.occupation();
        
    }
    
}
