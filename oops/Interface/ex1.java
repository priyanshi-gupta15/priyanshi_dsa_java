package oops.Interface;

 interface A{
     static final double time = 8.00;
    abstract void display();


    
}
class ex1 implements A {
    @Override
    public void display() // public is needed 
    {
        System.out.println("hy everyoune in inteface");


    }
    public static void main(String[] args) {
        ex1 s = new ex1();
        s.display();
        System.out.println(time);
        
    }

}
   
    
    

