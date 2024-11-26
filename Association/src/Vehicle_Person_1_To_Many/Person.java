package Vehicle_Person_1_To_Many;

public class Person {
    private String name;
    private int id;
    private Vehicle vehicles [];

    public Person(){}
    public Person(String name, int id, int count) {
        this.name = name;
        this.id = id;
        vehicles = new Vehicle[count];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //=========---------------
    public void setVehicles(int count)
    {
        vehicles = new Vehicle[count];
    }

    public void addVehicles(Vehicle v)
    {
        for (int i =0; i< vehicles.length;i++)
        {
            if(vehicles[i]==null)
            {
                vehicles[i]=v;
                break;
            }
        }
    }

    public  void deleteVehicles(Vehicle v)

    {
        for (int i=0; i<vehicles.length; i++)
        {
            if(vehicles[i]==v)
            {
                vehicles[i]=null;
                break;
            }
        }
    }

    public void searchVehicles(Vehicle v)
    {
        int check = 0;
        for(int i=0; i<vehicles.length; i++)
        {
            if(vehicles[i]==v)
            {
                check = 1;
                break;
            }
        }
        if(check == 1)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }

    public void display()
    {
        System.out.println("Person Name: "+name);
        System.out.println("Person ID: "+id);
        System.out.println("Vehicles class information");
        for(int i=0; i<vehicles.length; i++)
        {
            if(vehicles[i]!=null)
            {
                vehicles[i].display();
            }
        }

    }
}
