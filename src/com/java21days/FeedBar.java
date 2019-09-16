package com.java21days;
import java.awt.*;
import javax.swing.*;

public class FeedBar extends JFrame {
    public FeedBar () {
        super("FeedBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        // create buttons
        JButton load = new JButton("load");
        JButton save = new JButton("save");
        JButton subscribe = new JButton("subscribe");
        JButton unsubscribe = new JButton("unsubscribe");
        // add buttons to toolbar
        JToolBar bar = new JToolBar();
        bar.add(load);
        bar.add(save);
        bar.add(subscribe);
        bar.add(unsubscribe);
        // prepare user interface
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("South", bar);
        add("Center", scroll);
        pack();
        setVisible(true);
    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public static void main(String[] arguments){
        FeedBar fb = new FeedBar();
    }
}