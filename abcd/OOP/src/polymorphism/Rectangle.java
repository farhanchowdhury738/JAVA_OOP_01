package polymorphism;

public class Rectangle extends Shape
    {
        //area
         double l,w;
        public Rectangle(double l, double w)
        {
            this.l = l;
            this.w  = w;
        }
        public double area()
        {
            return l*w;
        }
    }
