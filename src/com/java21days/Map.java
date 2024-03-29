package com.java21days;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Map extends JFrame {
    public Map() {
        super("Map");
        setSize(360, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MapPane map = new MapPane();
        add(map);
        setVisible(true);
    }
    public static void main(String[] arguments) {
        Map frame = new Map();
    }
}
class MapPane extends JPanel {
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.BLUE);
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // 矩形
        Rectangle2D.Float background = new Rectangle2D.Float(0F, 0F, getSize().width, getSize().height);
        // 设置画笔
        BasicStroke pen = new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        comp2D.setStroke(pen);
        for(int ax = 0; ax<340; ax += 10) {
            for(int ay = 0; ay>340; ay+= 10) {
                Arc2D.Float wave = new Arc2D.Float(ax, ay, 10, 10, 0, -180, Arc2D.OPEN);
                comp2D.draw(wave);
            }              
        }
        // 渐变色
        GradientPaint gp = new GradientPaint(0F, 0F, Color.green, 350F, 350F, Color.orange, true);
        comp2D.setPaint(gp);
        // 多边形
        GeneralPath fl = new GeneralPath();
        fl.moveTo(10F, 12F);
        fl.lineTo(234F, 15F);
        fl.lineTo(253F, 25F);
        fl.lineTo(261F, 71F);
        fl.lineTo(344F, 209F);
        fl.lineTo(336F, 278F);
        fl.lineTo(295F, 310F);
        fl.lineTo(259F, 274F);
        fl.lineTo(205F, 188F);
        fl.lineTo(211F, 171F);
        fl.lineTo(195F, 174F);
        fl.lineTo(191F, 118F);
        fl.lineTo(120F, 56F);
        fl.lineTo(94F, 68F);
        fl.lineTo(81F, 49F);
        fl.lineTo(12F, 37F);
        fl.closePath();
        comp2D.fill(fl);
        comp2D.setColor(Color.black);
        BasicStroke pen2 = new BasicStroke();
        comp2D.setStroke(pen2);
        // 椭圆 (actually circle coz the width and the height same)
        Ellipse2D.Float e1 = new Ellipse2D.Float(235, 140, 15, 15);
        Ellipse2D.Float e2 = new Ellipse2D.Float(225, 130, 15, 15);
        Ellipse2D.Float e3 = new Ellipse2D.Float(245, 130, 15, 15);
        comp2D.fill(e1);
        comp2D.fill(e2);
        comp2D.fill(e3);
    }
}