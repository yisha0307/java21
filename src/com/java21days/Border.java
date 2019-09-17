package com.java21days;
import java.awt.*;
import javax.swing.*;

public class Border extends JFrame {
    public Border() {
        super("border layout");
        setSize(240, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        JButton nb = new JButton("north");
        JButton sb = new JButton("south");
        JButton wb = new JButton("west");
        JButton eb = new JButton("east");
        JButton cb = new JButton("center");
        add(nb, BorderLayout.NORTH);
        add(sb, BorderLayout.SOUTH);
        add(wb, BorderLayout.WEST);
        add(eb, BorderLayout.EAST);
        add(cb, BorderLayout.CENTER);
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
        Border nbb = new Border();
    }
}