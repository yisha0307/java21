package com.java21days;

import javax.swing.*;
// 要将组件加入到简单容器中，可以调用容器的add(Component)方法
public class ButtonFrame extends JFrame {
    // 创建了一个带三个button的窗口
    JButton load = new JButton("Load");
    JButton save = new JButton("Save");
    JButton unsubscribe = new JButton("Unsubscribe");
    
    public ButtonFrame() {
        super("BUTTON FRAME");
        setSize(340, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // panel add buttons
        JPanel panel = new JPanel();
        panel.add(load);
        panel.add(save);
        panel.add(unsubscribe);
        add(panel);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e) {
            System.out.print(e);
        }
    }
    public static void main(String[] arguments) {
        setLookAndFeel();
        ButtonFrame f = new ButtonFrame();
    }
}