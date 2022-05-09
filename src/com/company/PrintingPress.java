package com.company;

import java.util.UUID;

public class PrintingPress {
    private PageColor pageColor;
    private int maxCapacity;
    private final UUID uuid;
    private final int pagesPerMinute;


    public PrintingPress(PageColor pageColor, int maxCapacity, int pagesPerMinute) {
        this.pageColor = pageColor;
        this.maxCapacity = maxCapacity;
        this.pagesPerMinute = pagesPerMinute;
        this.uuid = UUID.randomUUID();
    }

    public PageColor getColor() {
        return pageColor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }


    public UUID getUuid() {
        return uuid;
    }

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    @Override
    public String toString() {
        return "Machines{" +
                "color=" + pageColor +
                ", maxCapacity=" + maxCapacity +
                ", uuid" + uuid +
                '}';
    }

    protected void print(Book book) {
        int production = book.getRequestedCount() * book.getPageCount();
        var printingDelay = (long)((double)60 / (double)this.pagesPerMinute * 1000);
        for (int i = 0; i < production; i++) {
            try {
                Thread.sleep(printingDelay);
                var str = String.format("Machine %s printed %s in %s color", this.uuid.toString(), book.getTitle(), getColor());
                System.out.println(str);
            } catch (InterruptedException e) {
                var s = String.format("Machine %s was interrupted from printing", this.uuid.toString());
                System.out.println(s);
            }
        }
    }
}
