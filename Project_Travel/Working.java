import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Working {

    public Working()
    {
        JFrame f = new JFrame("Login Page");

        JLabel l1 = new JLabel("this site still working now.. keep stay for few days");
        l1.setBounds(50,90, 290,25);
        f.add(l1);

        JButton b2 = new JButton("Home");
        b2.setBounds(120,120,80,27);
        b2.setBackground(Color.red);
        f.add(b2);


        f.setSize(440, 300);
        f.setLocation(150, 120);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Welcome();
            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new  Working();
    }
}
