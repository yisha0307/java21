package com.java21days;

import javax.swing.*;

public class FormatFrame extends JFrame {
    JRadioButton[] team = new JRadioButton[4];
    
    public FormatFrame() {
        super("Choose an Output Format");
        setSize(320, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        team[0] = new JRadioButton("Atom");
        team[1] = new JRadioButton("RSS 0.92");
        team[2] = new JRadioButton("RSS 1.0");
        team[3] = new JRadioButton("RSS 2.0", true);
        JPanel panel = new JPanel();
        JLabel chooseLabel = new JLabel("Choose an output format for syndicated news items.");
        panel.add(chooseLabel);
        ButtonGroup bg = new ButtonGroup();
        for(JRadioButton t:team) {
            bg.add(t);
            panel.add(t);
        }
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
        FormatFrame.setLookAndFeel();
        FormatFrame ff = new FormatFrame();
    }
}