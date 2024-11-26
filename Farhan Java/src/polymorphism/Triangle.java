package polymorphism;

public class Triangle extends  Shape{

    double base, heigth;

    Triangle(double base, double heigth)
    {
        this.base = base;
        this.heigth = heigth;
    }

    double area() {
        return 0.5*base*heigth;
    }
}
