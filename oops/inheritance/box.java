package oops.inheritance;

public class box {
    double l;
    double w;
    double h ;
    

    

      public box() {
        super(); // object class
        this.l = 9;
        this.w = 6;
        this.h = 5;

    }
    box( double side){
        this.l = side;
        this.w = side;
        this.h = side;

    }



    box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println(this.w);
    }
    box( double h, double w) {
        this.w = w;
        this.h = 88;
        System.out.println(this.w);
    }

    box (box old)
    {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("running the box");
    }
    
    
}
