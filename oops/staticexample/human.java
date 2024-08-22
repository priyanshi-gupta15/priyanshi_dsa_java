package oops.staticexample;

public class human {
    int age;
    int salary;
    static long population;

    public human(int age , int salary)
    {
        this.age =age;
        this.salary=salary;
        human.population +=1;

    }



}
