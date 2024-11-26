import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JFrame f;
    private JTextField t1;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    private JButton equal;
    private JButton bO1,bO2,bO3,bO4;

    Calc()
    {
        f = new JFrame("Calculator");
        f.setSize(300,400);
        f.setLocation(900,220);
        f.setLayout(null);
        f.setVisible(true);

        t1 = new JTextField();
        t1.setBounds(15,15,260,40);

        b1 = new JButton("1");
        b1.setBounds(15,80,45,30);

        b2 = new JButton("2");
        b2.setBounds(75,80,45,30);

        b3 = new JButton("3");
        b3.setBounds(140,80,45,30);
//----------------
        b4 = new JButton("4");
        b4.setBounds(15,130,45,30);

        b5 = new JButton("5");
        b5.setBounds(75,130,45,30);

        b6 = new JButton("6");
        b6.setBounds(140,130,45,30);

        b7 = new JButton("7");
        b7.setBounds(15,180,45,30);

        b8 = new JButton("8");
        b8.setBounds(75,180,45,30);

        b9 = new JButton("9");
        b9.setBounds(140,180,45,30);
//---------------------------
        b10 = new JButton("10");
        b10.setBounds(15,230,47,30);

        b11 = new JButton("11");
        b11.setBounds(75,230,47,30);

        b12 = new JButton("12");
        b12.setBounds(140,230,47,30);

        //==============================

        bO1 = new JButton("+");
        bO1.setBounds(220,80,45,30);

        bO2 = new JButton("-");
        bO2.setBounds(220,130,45,30);

        bO3 = new JButton("x");
        bO3.setBounds(220,180,45,30);

        bO4 = new JButton("/");
        bO4.setBounds(220,230,45,30);

//=============================

        equal = new JButton("=");
        equal.setBounds(40,280,200,37);

 //================================

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("1");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("2");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("3");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("3");
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("4");
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("5");
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("6");
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("7");
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("8");
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("9");
            }
        });

        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("10");
            }
        });

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("11");
            }
        });

        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("13");
            }
        });

//-----------------------
        bO1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("+");
            }
        });

        bO2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("-");
            }
        });

        bO3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("x");
            }
        });

        bO4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("/");
            }
        });

        //--------------------------------
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);

        f.add(bO1);
        f.add(bO2);
        f.add(bO3);
        f.add(bO4);

        f.add(equal);


    }

}
