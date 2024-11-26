package Student_Corse_1_to_Many;

public class Course {

    private String cosName;
    private int cosId;

    public Course(){ }
    public Course(String cosName, int cosId) {
        this.cosName = cosName;
        this.cosId = cosId;
    }

    public String getCosName() {
        return cosName;
    }

    public void setCosName(String cosName) {
        this.cosName = cosName;
    }

    public int getCosId() {
        return cosId;
    }

    public void setCosId(int cosId) {
        this.cosId = cosId;
    }

    public void display()
    {
        System.out.println(cosName);
        System.out.println(cosId);
    }
}
