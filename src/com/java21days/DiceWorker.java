package com.java21days;

import javax.swing.*;

public class DiceWorker extends SwingWorker {
    int timesRoll;
    // set up the swing worker
    public DiceWorker(int timesRoll) {
        super();
        this.timesRoll = timesRoll;
    }
    // define the task worker performs
    protected int[] doInBackground () {
        int[] result = new int[16];
        for (int i = 0; i<this.timesRoll; i++) {
            int sum = 0;
            for (int j=0;j<3; j++){
                sum += Math.floor(Math.random() * 6);
            }
            result[sum] = result[sum] + 1;
        }
        return result;
    }
}