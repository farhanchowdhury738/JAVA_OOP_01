
import javax.swing.*;

 class Gui{

    Gui()
    {
        JFrame f = new JFrame("Practice");


        JLabel t1 = new JLabel("Name");
        JLabel t2 = new JLabel("ID");
        JLabel t3 = new JLabel("Password");

        JTextField b1 = new JTextField();
        JTextField b2 = new JTextField();
        JPasswordField b3 = new JPasswordField();

        JButton b = new JButton("Next");


        t1.setBounds(50,20,80,40);
        t2.setBounds(50,65,80,40);
        t3.setBounds(50,110,80,40);

        b1.setBounds(120,30,120,30);
        b2.setBounds(120,80,120,30);
        b3.setBounds(120,120,120,30);




        f.add(t1);
        f.add(t2);
        f.add(t3);
        //-----
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setSize(400,400);

        f.setLayout(null);
        f.setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {

        new Gui();
    }
}