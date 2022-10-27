//Write a java program to implement JPanel Class.

import javax.swing.*;
import java.awt.event.*;

public class P13 extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1;
    JLabel l1;
    JPanel p1;

    P13() {
        t1 = new JTextField();
        b1 = new JButton("Click Me");
        l1 = new JLabel("Hello World");
        p1 = new JPanel();
        p1.setBounds(100, 100, 100, 30);
        t1.setBounds(100, 100, 100, 30);
        b1.setBounds(100, 150, 100, 30);
        l1.setBounds(100, 200, 100, 30);
        b1.addActionListener(this);
        p1.add(t1);
        p1.add(b1);
        p1.add(l1);
        add(p1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        l1.setText(t1.getText());
    }

    public static void main(String[] args) {
        new P13();
    }
}