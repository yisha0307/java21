package com.java21days;
import javax.swing.*;
// 显示一个不包含任何界面组件的框架
public class SimpleFrame extends JFrame {
    public SimpleFrame() {
        super("Frame Title");
        setSize(300, 150);
        // 框架关闭时退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            // 将框架的外观设置为Nimbus
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc){
            // ignore error
            System.out.print(exc);
        }
    }
    public static void main(String[] arguments) {
        setLookAndFeel();
        SimpleFrame sf = new SimpleFrame();
    }
}