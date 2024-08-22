package oops.inheritance;

public class boxweight extends box {
    double weight;
    public boxweight(double weight) {
        super();
        this.weight = weight;
    }
    public boxweight(double h, double weight) {
        super(h);
        System.out.println(super.h);
        this.weight = weight;
        
    }
    public boxweight(double l, double w, double h, double weight) {
        super(l, w, h); // callling the parent class contructer;
        this.weight = weight;
    }
    public boxweight(box old, double weight) {
        super(old);
        this.weight = weight;
    }

    public boxweight()
    {
       this .weight=-1; 
    }
  
    
}
