package com.java21days;
import java.awt.*;
import javax.swing.*;

public class ProgressMonitor extends JFrame {
    JProgressBar current;
    JTextArea out;
    JButton find;
    int num = 0;
        
    public ProgressMonitor() {
        super("Progress Monitor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(205, 68);
        setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(current);
    }
    public void iterate() {
        while(num < 2000) {
            current.setValue(num);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
            num +=95;
        }
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
        ProgressMonitor pm = new ProgressMonitor();
        pm.setVisible(true);
        pm.iterate();
    }
}