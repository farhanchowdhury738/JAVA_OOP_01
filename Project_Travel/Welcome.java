import javax.swing.*;

public class Welcome
{
    private JFrame f;

    public Welcome()
    {
        f = new JFrame("Welcome");
        f.setSize(900,500);
	f.setLayout(null);
	f.setVisible(true);
    }

    public static void main(String[] args) {
        new Welcome();
    }
}