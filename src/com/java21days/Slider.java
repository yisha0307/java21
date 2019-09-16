package com.java21days;

import javax.swing.*;

public class Slider extends JFrame {
    public Slider() {
        super("slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JSlider pick = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
        pick.setMajorTickSpacing(10);
        pick.setMinorTickSpacing(1);
        // 决定是否显示刻度线
        pick.setPaintTicks(true);
        // 决定是否显示数字标签
        pick.setPaintLabels(true);
        add(pick);
        pack();
        setVisible(true);
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
        Slider ss = new Slider();
    }
}