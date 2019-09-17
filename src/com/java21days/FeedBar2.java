package com.java21days;
import java.awt.*;
import javax.swing.*;

public class FeedBar2 extends JFrame {
    public FeedBar2() {
        super("FeedBar 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        // create buttons
        JButton load = new JButton("load");
        JButton save = new JButton("save");
        JButton sub = new JButton("subscribe");
        JButton unsub = new JButton("unsubscribe");
        // add buttons to toolbar
        JToolBar tbar = new JToolBar();
        tbar.add(load);
        tbar.add(save);
        tbar.add(sub);
        tbar.add(unsub);
        // create menu
        JMenuItem j1 = new JMenuItem("load");
        JMenuItem j2 = new JMenuItem("save");
        JMenuItem j3 = new JMenuItem("subscribe");
        JMenuItem j4 = new JMenuItem("unsubscribe");
        JMenuBar menubar = new JMenuBar();
        // 不要忘记给menu命名(加title)
        JMenu mmenu = new JMenu("Feeds");
        mmenu.add(j1);
        mmenu.add(j2);
        mmenu.addSeparator();
        mmenu.add(j3);
        mmenu.add(j4);
        menubar.add(mmenu);
        // prepear user interface
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scrollp = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("South", tbar);
        add("Center", scrollp);
        setJMenuBar(menubar);
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
    public static void main(String[] arguments) {
        FeedBar2 ffb = new FeedBar2();
    }
}