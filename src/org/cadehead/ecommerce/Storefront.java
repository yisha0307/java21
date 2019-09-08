package org.cadehead.ecommerce;

import java.util.*;

public class Storefront {
    private LinkedList catalog = new LinkedList();
    
    public void addItem(String id, String name, String price, String quant) {
        Item it = new Item(id, name, price, quant);
        catalog.add(it);
    }
    public Item getItem(int i) {
        return (Item) catalog.get(i);
    }
    public int getSize() {
        return catalog.size();
    }
    public void sort() {
        // 调用item里的compareTo进行sort
        Collections.sort(catalog);
    }
}