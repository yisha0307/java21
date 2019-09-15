package com.java21days;

import javax.swing.*;

public class FormatFrame2 extends JFrame {
    String[] formats = {"Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0"};
    JComboBox formatBox = new JComboBox(formats);
    
    public FormatFrame2() {
        super("Choose an Output Format");
        setSize(220,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel formatLabel = new JLabel("Output formats: ");
        panel.add(formatLabel);
        panel.add(formatBox);
    
        add(panel);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public static void main(String[] arguments) {
        FormatFrame2.setLookAndFeel();
        FormatFrame2 ff = new FormatFrame2();
    }
}