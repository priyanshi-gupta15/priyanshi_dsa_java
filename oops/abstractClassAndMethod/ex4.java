package oops.abstractClassAndMethod;

//Similar to the interface we can define static methods in an abstract class that can be called independently without an object. 


// Java Program to Illustrate 

// Class 1
// Abstract class
abstract class Helper {

    final int SIZE = 90;
 
    // Abstract method
    static void demofun()
    {
 
        // Print statement
        System.out.println("hyyy welcome back");
    }
}

public class ex4 extends Helper {
 
        // Main driver method
        public static void main(String[] args)
        {
     
            // Calling method inside main()
            // as defined in above class
            Helper.demofun();
    
        }
    }
    