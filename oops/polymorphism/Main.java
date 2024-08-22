package oops.polymorphism;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        shapes shape = new shapes();
        Circle circle = new Circle();
        Square square = new Square();
        shapes sqaure1 = new Square();
      //  Circle circle2 = (Circle) new Square();   //error
       // circle2.area(); // error

        //sqaure1.area();

       //  shape.area();
    }
    
}
