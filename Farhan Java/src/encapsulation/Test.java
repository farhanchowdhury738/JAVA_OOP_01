package encapsulation;
class Mobile {

    private String brandname;
    private double price;

   public Mobile(){

   }
    public Mobile(String brandname, double price) {
        setBrandname(brandname);
        setPrice(price);
    }
    public void setBrandname(String name)
    {
        this.brandname = brandname;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public String getBrandname ()
    {
        return brandname;
    }
    public double getPrice()
    {
        return price;
    }

    public void display()
    {
        System.out.println(brandname);
        System.out.println(price);
    }

}

public class Test {
    public static void main(String[] args) {
        Mobile rectangle = new Mobile("hello", 6);
        rectangle.display();

    }
}

