package com.company;

public enum PaperSize {
    А1(0.01), А2(0.02), А3(0.03), А4(0.04), А5(0.05);

    private double value;

    PaperSize(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}