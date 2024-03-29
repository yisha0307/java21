package com.java21days;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyChecker2 extends JFrame {
    JLabel keylabel = new JLabel("hit any key");
    public KeyChecker2() {
        super("hit a key");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        KeyAdapter monitor = new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keylabel.setText("" + evt.getKeyChar());
                repaint();
            }
        };
        setFocusable(true);
        addKeyListener(monitor);
        add(keylabel);
        setVisible(true);
    }
    private static void setLookAndFeel () {
        try {
            UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.err.println("Couldn't use the system " + "look and feel: " + exc);
        }
    }
    public static void main(String[] arguments) {
        KeyChecker2.setLookAndFeel();
        new KeyChecker2();
    }
}