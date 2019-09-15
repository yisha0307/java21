package com.java21days;

import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = {"Burningbird", "nsdfjwo", "irj", "xnfwo", "anwjnow", "sndjfn", "sdfjoewi", "asnojqwen","wenrnweo"};
    JList<String> sublist = new JList<>(subs);
    
    public Subscriptions() {
        super("Subscriptions");
        setSize(150, 335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel sublabel = new JLabel("RSS Subscription");
        
        panel.add(sublabel);
        // 默认显示8项，可修改
        sublist.setVisibleRowCount(8);
        JScrollPane scroller = new JScrollPane(sublist);
        
        panel.add(scroller);
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
    public static void main(String[] arguments){
        Subscriptions.setLookAndFeel();
        Subscriptions ss = new Subscriptions();
    }
}