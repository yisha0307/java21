package com.java21days;

import java.awt.*;
import javax.swing.*;

public class SurveyFrame extends JFrame{
    public SurveyFrame() {
        super("Survey");
        setSize(290, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        SurveyWizard wsw = new SurveyWizard();
        add(wsw);
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
    // 覆盖insets方法来制定内边距
    public Insets getInsets () {
        return new Insets(10, 30, 10, 30);
    }
    public static void main(String[] arguments) {
        SurveyFrame sf = new SurveyFrame();
    }
}