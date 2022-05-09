package com.company;

public enum PageColor {
    COLORFUL(1), BLACKWHITE(3);

    private double numVal;

    PageColor(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }
}
