package AccessModifiers;

public class AccessModifiers {

    public String name;
    protected String email;
    private int id;

    public void setEmail (String email)
    {
        this.email = email;
    }
    public void setId (int id)
    {
        this.id = id;
    }

    public void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("ID: "+id);
        System.out.println();
    }
}
