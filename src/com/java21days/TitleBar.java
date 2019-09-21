package com.java21days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TitleBar extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    
    public TitleBar() {
        super("Title bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        
        b1 = new JButton("Rosencrantz");
        b2 = new JButton("Guildenstern");
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }
    // overlay actionperformed func for actionListener
    // actionperformed is the one and the only method that actionListerner has
    public void actionPerformed(ActionEvent evt) {
        // find out the action source
        Object source = evt.getSource();
        if (source == b1) {
            setTitle("osencrantz");
        } else if (source == b2) {
            setTitle("Guildenstern");
        }
    }
    private void setLookAndFeel () {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public static void main(String[] arguments) {
        TitleBar tb = new TitleBar();
    }
}