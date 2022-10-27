//Write a java program to implement Chat Frame comprising JFrame, JMenuBar, JMenu, JMenuItem, JPanel, JLabel, JTextField, JButton etc.

import javax.swing.*;
import java.awt.event.*;

public class P15 extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1;
    JLabel l1;
    JPanel p1;
    JMenuBar mb;
    JMenu m1;
    JMenuItem mi1, mi2, mi3;

    P15() {
        t1 = new JTextField();
        b1 = new JButton("Click Me");
        l1 = new JLabel("Hello World");
        p1 = new JPanel();
        mb = new JMenuBar();
        m1 = new JMenu("File");
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        p1.setBounds(100, 100, 100, 30);
        t1.setBounds(100, 100, 100, 30);
        b1.setBounds(100, 150, 100, 30);
        l1.setBounds(100, 200, 100, 30);
        b1.addActionListener(this);
        p1.add(t1);
        p1.add(b1);
        p1.add(l1);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        mb.add(m1);
        setJMenuBar(mb);
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
        new P15();
    }
}