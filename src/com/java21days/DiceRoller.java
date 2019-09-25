package com.java21days;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

public class DiceRoller extends JFrame implements ActionListener, PropertyChangeListener {
    JTextField[] total = new JTextField[16];
    JButton roll;
    JTextField quantity;
    DiceWorker worker;
    
    public DiceRoller() {
        super("Dice Roller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(850, 145);
        
        // set up top row
        JPanel topPane = new JPanel();
        GridLayout paneGrid = new GridLayout(1,16);
        topPane.setLayout(paneGrid);
        for (int i = 0; i < 16;i++) {
            total[i] = new JTextField("0", 4);
            JLabel label = new JLabel((i+3) +": ");
            // create this cell in the grid
            JPanel cell = new JPanel();
            cell.add(label);
            cell.add(total[i]);
            topPane.add(cell);
        }
        // set up the bottom row
        JPanel bottomPane = new JPanel();
        JLabel quantityLabel = new JLabel("Times to roll: ");
        quantity = new JTextField("0", 5);
        roll = new JButton("Roll");
        roll.addActionListener(this);
        bottomPane.add(quantityLabel);
        bottomPane.add(quantity);
        bottomPane.add(roll);
        // set up frame
        GridLayout frameGrid = new GridLayout(2, 1);
        setLayout(frameGrid);
        add(topPane);
        add(bottomPane);
        
        setVisible(true);
    }
    // respond when the "roll" button is clicked
    public void actionPerformed(ActionEvent event) {
        int timesToRoll;
        try {
            // turn off the button
            timesToRoll = Integer.parseInt(quantity.getText());
            roll.setEnabled(false);
            // set up the worker that will roll the dice
            worker = new DiceWorker(timesToRoll);
            worker.addPropertyChangeListener(this);
            // start the worker
            worker.execute();
        } catch(Exception exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }
    }
    public void propertyChange(PropertyChangeEvent event) {
        try {
            // get() to get the result of the worker's execution
            int[] result = (int[]) worker.get();
            // store the results in text fields
            for(int i = 0; i< result.length; i++) {
                total[i].setText("" + result[i]);
            }
        } catch(Exception exc) {
            // ignore error
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
    public static void main(String[] arguements) {
        new DiceRoller();
    }
}