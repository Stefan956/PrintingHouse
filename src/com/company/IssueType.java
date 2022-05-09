package com.company;

public enum IssueType {
    NEWSPAPER(0.01), MAGAZINE(0.03), STANDARD(0.02);

    private double numVal;

    IssueType(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
