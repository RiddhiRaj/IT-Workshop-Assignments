// Write a java program to implement JMenu Class.

import javax.swing.*;
import java.awt.event.*;

public class P14 extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1, i2, i3, i4;

    P14() {
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Cut");
        i4 = new JMenuItem("Paste");
        m1.add(i1);
        m1.add(i2);
        m2.add(i3);
        m2.add(i4);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        new P14();
    }
}