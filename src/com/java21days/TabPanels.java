package com.java21days;

import java.awt.*;
import javax.swing.*;

public class TabPanels extends JFrame {
    public TabPanels() {
        super("Tabbed Panes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(480, 218);
        JPanel mainSettings = new JPanel();
        JPanel advancedSettings = new JPanel();
        JPanel privacySettings = new JPanel();
        JPanel emailSettings = new JPanel();
        JPanel securitySettings = new JPanel();
        JTabbedPane tabs = new JTabbedPane();
        // 设置卡式窗格的选项卡标签和窗格
        tabs.add("Main", mainSettings);
        tabs.add("Advanced", advancedSettings);
        tabs.add("Privacy", privacySettings);
        tabs.add("Email", emailSettings);
        tabs.add("Security", securitySettings);
        add(tabs);
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
        TabPanels ttbb = new TabPanels();
    }
}