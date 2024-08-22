package oops.Interface.cars;

public class car implements engine  , brake{

    @Override
    public void acc() {
        System.out.println("i am super brake");
        
    }

    @Override
    public void start() {
        System.out.println("i am super start");
    }

    @Override
    public void stop() {
        System.out.println("i am super stop");
        
    }

    @Override
    public void brake() {
     System.out.println("i am super accelerate");
        
    }
    
    
}
