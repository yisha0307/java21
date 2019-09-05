package com.java21days;

import java.awt.Point;

class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    
    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }
    
    Box buildBox(Point topLeft, Point bottomRight) {
        return buildBox(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }
    
    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = x1 + w;
        y2 = x2 + h;
        return this;
    }
    void printBox() {
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }
    
    public static void main(String[] arguments) {
        Box rect = new Box();
        System.out.println("Calling buildBox with coordinates (25, 25) and (50, 50):");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();
        
        rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect.printBox();
        
        rect.buildBox(new Point(10, 10), 50, 50);
        rect.printBox();
    }
}