package polymorphism;

public class Triangle extends Shape{
    //area
    double b,h;

    public Triangle(double b, double h)
    {
        this.b = b;
        this.h = h;
    }
    public double area(){
        return 0.5*b*h;
    }
}
