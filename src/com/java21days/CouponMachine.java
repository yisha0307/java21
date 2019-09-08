package com.java21days;

class Logger {
    private String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String fmt) {
        if ((fmt.equals("common")) || fmt.equals("combined")) {
            this.format = fmt;
        }
    }
}