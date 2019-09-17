package com.java21days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bunch extends JFrame {
    public Bunch() {
        super("bunch");
        setSize(260, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JPanel pane = new JPanel();
        GridLayout family = new GridLayout(3, 3, 10, 10);
        pane.setLayout(family);
        JButton a = new JButton("awehr");
        JButton b = new JButton("bsor");
        JButton c = new JButton("cjfhow");
        JButton d = new JButton("dqwjenrl");
        JButton e = new JButton("ecds");
        JButton f = new JButton("fsdf");
        JButton g = new JButton("dqwjenrl");
        JButton h = new JButton("ecds");
        JButton i = new JButton("fsdf");
        pane.add(a);
        pane.add(b);
        pane.add(c);
        pane.add(d);
        pane.add(e);
        pane.add(f);
        pane.add(g);
        pane.add(h);
        pane.add(i);
        add(pane);
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
        Bunch bun = new Bunch();
    }
}