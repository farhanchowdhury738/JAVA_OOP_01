package Student_Corse_1_to_Many;

public class Student {
    private String name;
    private int id;

    private Course c[];

    public Student(){}
    public Student(String name, int id,int count) {
        this.name = name;
        this.id = id;
        c = new Course[count];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setC(int count)
    {
        c = new Course[count];
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    //==============-------------------
    public void addCourse(Course course)
    {
        for(int i=0; i<c.length; i++)
        {
            if(c[i]==null)
            {
                c[i]=course;
                break;
            }
        }
    }

    public void deleteCourse(Course course)
    {
        for(int i=0; i<c.length; i++)
        {
            if(c[i]!=null)
            {
                c[i]=null;
                break;
            }
        }
    }
    public void searchCourse(Course course)
    {
        int checkpost=0;
        for(int i=0; i<c.length; i++) {
            if (c[i] == course)
            {
                checkpost = 1;
                break;
            }
        }
        if (checkpost==1)
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
        System.out.println(name);
        System.out.println(id);
        for(int i=0; i<c.length; i++)
        {
            if(c[i]!=null)
            {
                c[i].display();
            }
        }
    }
}
