
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public Login() {
        JFrame f = new JFrame("Login Page");

        f.setSize(900, 500);
        f.setLocation(150, 120);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        //p2.setBackground(new Color(131, 193, 233));
        p2.setBounds(0, 0, 450, 500);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/travel1.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p2.add(image);


        JLabel l1 = new JLabel("User Account ");
        JLabel l2 = new JLabel("Passowrd     ");
        JTextField t1 = new JTextField();
        JPasswordField p1 = new JPasswordField();
        JButton b1 = new JButton("Login");
        JButton b2 = new JButton("SignUp");
        JButton b3 = new JButton("Forget Password");


        l1.setBounds(570, 100, 90, 30);
        l2.setBounds(570, 150, 90, 30);
        t1.setBounds(660, 100, 150, 30);
        p1.setBounds(660, 150, 150, 30);
        b1.setBounds(550, 205, 100, 27);
        b2.setBounds(730, 205, 100, 27);
        b3.setBounds(620, 250, 150, 27);

        b1.setBackground(Color.decode("#C00000"));


        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(p1);
        f.add(b1);
        f.add(p2);
        f.add(b2);
        f.add(b3);


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
                new Splash();
            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
