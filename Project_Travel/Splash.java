
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;
public class Splash
{
    private JFrame f;
    public Splash()
    {
        f = new JFrame("Travel");

        JLabel l1 = new JLabel("User Account ");
        JLabel l2 = new JLabel("Passowrd     ");
        JTextField t1 = new JTextField();
        JPasswordField p1 = new JPasswordField();
        JButton b1 = new JButton("Login");


        JButton b2 = new JButton("Back");
        b2.setBackground(Color.red);
        b2.setBounds(200,205,80,27);
        f.add(b2);



        l1.setBounds(70,100,90,30);
        l2.setBounds(70,150,90,30);
        t1.setBounds(160,100,110,30);
        p1.setBounds(160,150,110,30);
        b1.setBounds(95,205,80,27);


        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(p1);
        f.add(b1);


        // Image add not working
      /*  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
    */
        //f.add(image);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Working();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Login();
            }
        });

        f.setSize(400,400);
        f.setLocation(150,120);
        f.setLayout(null);
        f.setVisible(true);

    }


    public static void main(String[] args) {
        new Splash();
    }
}
