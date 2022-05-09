package com.company;

public class Order {
    private int requestedCount;

    public Order() {

    }

    public Order(int requestedCount) {
        this.requestedCount = requestedCount;
    }

    public int getRequestedCount() {
        return requestedCount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "requestedCount=" + requestedCount +
                '}';
    }
}
