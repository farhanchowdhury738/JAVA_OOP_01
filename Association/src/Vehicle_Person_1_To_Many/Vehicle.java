package Vehicle_Person_1_To_Many;

public class Vehicle {
    private String brandName;
    private String brandModel;

    public Vehicle(){}
    public Vehicle(String brandName, String brandModel) {
        this.brandName = brandName;
        this.brandModel = brandModel;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public void display()
    {
        System.out.println("Brand Name: "+brandName);
        System.out.println("Brand Model: "+brandModel);
        System.out.println("------------");
    }
}
