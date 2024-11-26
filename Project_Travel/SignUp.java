import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp {

     JFrame f;
     JLabel label1, imgLabel;
    Font f1, f2, f3, f4, f5, f6;
   JTextField tf1, tf2, tf3, tf4, tf5;
    public SignUp()
    {
        f = new JFrame("SignUP Form");

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Your Information");
        label1.setBounds(200, 25, 500, 50);
        label1.setFont(f1);
        f.add(label1);

        // User Name
        JLabel l1 = new JLabel("User Name");
        l1.setBounds(200,75,200,40);
        l1.setFont(f2);
        f.add(l1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(350,85,250,30);
        f.add(tf1);

        // Email
        JLabel l2 = new JLabel("Email");
        l2.setBounds(200,115,200,40);
        l2.setFont(f2);
        f.add(l2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(350,120,250,30);
        f.add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(200,145,200,40);
        label1.setFont(f2);
        f.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(350,155,250,30);
        tf3.setFont(f2);
        f.add(tf3);

        //
        JButton btn4 = new JButton("Register");
        btn4.setBounds(649, 325, 183, 50);
        btn4.setFont(f2);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        f.add(btn4);


        //Register button
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textField1 = tf1.getText().toLowerCase();//User name
                String textField2 = tf2.getText(); //email
                String textField3 = tf3.getText(); //password

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // JFrame Layout
        f.setSize(900,450);
        f.setLocation(150, 120);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new SignUp();
    }
}
