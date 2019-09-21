package com.java21days;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame implements FocusListener {
    JTextField value1, value2, sum;
    JLabel plus, equals;
    
    public Calculator () {
        super("CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow);
        // create components    
        value1 = new JTextField("0", 5);
        value2 = new JTextField("0", 5);
        sum = new JTextField("0", 5);
        plus = new JLabel("+");
        equals = new JLabel("=");
        // add listeners
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        // set up the sum field
        sum.setEditable(false);
        add(value1);
        add(plus);
        add(value2);
        add(equals);
        add(sum);
        pack();
        setVisible(true);
    }
    public void focusGained (FocusEvent evt) {
        try {
            float total = Float.parseFloat(value1.getText()) + Float.parseFloat(value2.getText());
            sum.setText("" + total);
        } catch (NumberFormatException nfe) {
            value1.setText("0");
            value2.setText("0");
            sum.setText("0");
        }
    }
    public void focusLost(FocusEvent evt) {
        focusGained(evt);
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
        Calculator cc = new Calculator();
    }
}