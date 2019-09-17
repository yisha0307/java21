package com.java21days;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// set flowLayout
public class Alphabet extends JFrame {
    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 120);
        setLookAndFeel();
        // 方向可以是center/left/right/leading/trailing(capitalized)
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        JButton a = new JButton("awehr");
        JButton b = new JButton("bsor");
        JButton c = new JButton("cjfhow");
        JButton d = new JButton("dqwjenrl");
        JButton e = new JButton("ecds");
        JButton f = new JButton("fsdf");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public static void main(String[] arguments) {
        Alphabet alb = new Alphabet();
    }
}