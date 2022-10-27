//Write a java program to implement JButton Class.

import javax.swing.*;
import java.awt.event.*;

public class P11 extends JFrame implements ActionListener {
    JButton b1, b2;
    JLabel l1;

    P11() {
        b1 = new JButton("Click Me");
        b2 = new JButton("Exit");
        l1 = new JLabel("Hello World");
        b1.setBounds(100, 100, 100, 30);
        b2.setBounds(100, 150, 100, 30);
        l1.setBounds(100, 200, 100, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        add(l1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setText("Button Clicked");
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new P11();
    }
}