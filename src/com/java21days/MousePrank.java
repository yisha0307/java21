package com.java21days;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MousePrank extends JFrame implements ActionListener {
    public MousePrank() {
        super("message");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        JLabel msg = new JLabel("click OK to close program");
        add(BorderLayout.NORTH, msg);
        PrankPanel prank= new PrankPanel();
        prank.ok.addActionListener(this);
        add(BorderLayout.CENTER, prank);
        setSize(420, 220);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt) {
        System.exit(0);
    }
    public Insets getInsets() {
        // set间距
        return new Insets(40, 10, 10, 10);
    }
    private static void setLookAndFeel() { 
        try {
            UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.err.println("Couldn't use the system " + "look and feel: " + exc);
        } 
    }
    public static void main(String[] arguments) {
        MousePrank.setLookAndFeel();
        MousePrank mmp = new MousePrank();
    }
}

// define prankpanel
class PrankPanel extends JPanel implements MouseMotionListener {
    JButton ok = new JButton("ok");
    int buttonX, buttonY, mouseX, mouseY;
    int width, height;
    
    PrankPanel() {
        super();
        setLayout(null);
        addMouseMotionListener(this);
        buttonX = 110;
        buttonY = 110;
        ok.setBounds(new Rectangle(buttonX, buttonY, 70, 20));
        add(ok);
    }
    public void mouseMoved(MouseEvent event){
        mouseX = event.getX();
        mouseY = event.getY();
        width = (int) getSize().getWidth();
        height = (int) getSize().getHeight();
        if(Math.abs((mouseX + 35) - buttonX) < 50) {
            buttonX = moveButton(mouseX, buttonX, width);
            // repaint导致面板的paintComponent(Graphics)被调用
            repaint();
        }
        if(Math.abs((mouseY + 10) - buttonY) < 50) {
            buttonY = moveButton(mouseY, buttonY, height);
            repaint();
        }
    }
    public void mouseDragged(MouseEvent event) {
        // ignore this event
    }
    private int moveButton(int mouseAt, int buttonAt, int bord) {
        if (buttonAt < mouseAt) {
            buttonAt--;
        } else {
            buttonAt ++;
        }
        if (buttonAt > (bord-20)) {
            buttonAt = 10;
        }
        if (buttonAt < 0) {
            buttonAt = bord - 80;
        }
        return buttonAt;
    }
    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        ok.setBounds(buttonX, buttonY, 70, 20);
    }
}