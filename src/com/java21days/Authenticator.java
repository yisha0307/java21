package com.java21days;
import javax.swing.*;

public class Authenticator extends javax.swing.JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok = new JButton("ok");
    JButton cancel = new JButton("cancel");
    
    public Authenticator() {
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane= new JPanel();
        JLabel usernamelabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        // 创建了一个文本区域，带垂直滚动条，但是没有水平滚动条
        JScrollPane scroll = new JScrollPane(comments, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pane.add(usernamelabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(commentsLabel);
        pane.add(scroll);
        pane.add(ok);
        pane.add(cancel);
        add(pane);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sum.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }    
    public static void main(String[] arguments) {
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}
