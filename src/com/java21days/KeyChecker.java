package com.java21days;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyChecker extends JFrame {
    JLabel keylabel = new JLabel("hint any key");
    public KeyChecker() {
        super("hit a key");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        KeyMonitor monitor = new KeyMonitor(this);
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
        KeyChecker.setLookAndFeel();
        new KeyChecker();
    }
}
// keyAdapter 对应键盘事件的监听器
class KeyMonitor extends KeyAdapter {
    KeyChecker display;
    KeyMonitor(KeyChecker display) {
        this.display = display;
    }
    public void keyTyped(KeyEvent evt) {
        display.keylabel.setText("" + evt.getKeyChar());
        display.repaint();
    }
}