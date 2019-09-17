package com.java21days;
import java.awt.*;
import javax.swing.*;

public class Stacker extends JFrame {
    public Stacker() {
        super("stacker");
        setSize(430, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        // create top panel
        JPanel jp = new JPanel();
        BoxLayout boxl = new BoxLayout(jp, BoxLayout.X_AXIS);
        jp.setLayout(boxl);
        JButton sub = new JButton("subscribe");
        JButton unsub = new JButton("unsubscribe");
        JButton refresh = new JButton("refresh");
        JButton save = new JButton("save");
        jp.add(sub);
        jp.add(unsub);
        jp.add(refresh);
        jp.add(save);
        // create bottom panel
        JPanel textPane = new JPanel();
        JTextArea text = new JTextArea(4, 70);
        JScrollPane scroll = new JScrollPane(text);
        // put them together
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(jp);
        add(scroll);
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
    public static void main(String[] arguments) {
        Stacker ss = new Stacker();
    }
}