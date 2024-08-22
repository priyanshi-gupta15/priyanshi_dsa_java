package oops.abstractClassAndMethod;

 // 1. Example of Abstract Class that has Abstract method


    abstract class shape{
        int color;
        abstract void draw();
        //abstract void draw(){}    gives an error

        // {
        //    System.out.println("hu i am drawer");
        // a  abstract class or method does not descibe a body 
        // }

    }

    class book extends shape{
        void draw()
        {
            System.out.println("hy i am draing book please draw something");

        }

    }

    class board extends book{
        void draw()
        {
            System.out.println("hy draw something");
        }
    }
    public class example1 {
    public static void main(String[] args) {
        board obj1 = new board();
        obj1.draw();
        
    }

}
