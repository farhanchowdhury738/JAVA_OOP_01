package Bank_Employee_1_to_Many;

public class Bank {

    private static String name;
    private String address;
    private Employee employee[];

    public Bank(){}

    public Bank(String name, String address, int count) {
        this.name = name;
        this.address = address;
        employee = new Employee[count];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setEmployee(int count) {
        employee = new Employee[count];
    }

    public void addEmployee(Employee e)
    {
        for(int i=0; i<employee.length; i++)
        {
            if(employee[i]==null)
            {
                employee[i]=e;
                break;
            }
        }
    }

    public void deleteEmployee(Employee e)
    {
        for(int i=0; i<employee.length; i++)
        {
            if(employee[i]==e)
            {
                employee[i]=null;
                break;
            }
        }
    }

    public void searchEmployee(Employee e)
    {
        int check =0;
        for(int i=0; i<employee.length; i++)
        {
            if(employee[i]==e)
            {
                check =1;
                break;
            }
        }
        if(check==1)
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
        System.out.println("Bank Name:"+name);
        System.out.println("Bank Address: "+address);
        for(int i=0; i<employee.length; i++)
        {
            if(employee[i]!=null)
            {
                employee[i].display();
            }
            System.out.println("------------");
        }
    }
}
