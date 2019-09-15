package com.java21days;
import javax.swing.*;

public class IconImage extends JFrame {
    JButton load, save, subscribe, unsubscribe;
    JTextField field1, field2;
    
    public IconImage() {
        super("Icon Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        // create icons
        ImageIcon loadicon = new ImageIcon("load.gif");
        ImageIcon saveicon = new ImageIcon("save.gif");
        ImageIcon subicon = new ImageIcon("subscribe.gif");
        ImageIcon unsubicon = new ImageIcon("unsubscribe.gif");
        // create buttons
        load = new JButton("Load", loadicon);
        save = new JButton("Save", saveicon);
        subscribe = new JButton("subscribe", subicon);
        unsubscribe = new JButton("unsubscribe", unsubicon);
        // text field
        field1 = new JTextField(10);
        field2 = new JTextField("Enter feed URL here", 10);
        // password field
        JPasswordField codePhrase = new JPasswordField(15);
        codePhrase.setEchoChar('#');
        panel.add(load);
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);
        panel.add(field1);
        panel.add(field2);
        panel.add(codePhrase);
        add(panel);
        // fit to reasonable size
//        pack();
        setSize(300, 400);
        setVisible(true);
    }
    public static void main(String[] arguments) {
        IconImage ike = new IconImage();
    }
}