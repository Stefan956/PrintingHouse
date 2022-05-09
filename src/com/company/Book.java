package com.company;

public class Book extends Order{
    private String title;
    private int pageCount;
    private PaperSize paperSize;
    private IssueType issueType;


    public Book(int requestedCount, String title, int pageCount, PaperSize paperSize, IssueType issueType) {
        super(requestedCount);
        this.title = title;
        this.pageCount = pageCount;
        this.paperSize = paperSize;
        this.issueType = issueType;


    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public PaperSize getFormat() {
        return paperSize;
    }

    public IssueType getTypeOfPaper() {
        return issueType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", format=" + paperSize +
                ", typeOfPaper=" + issueType +
                '}';
    }

    public double price() {
        return (this.paperSize.getValue() + this.issueType.getNumVal()) * this.pageCount;
    }

    public double calculateBookIncome(){
        double  increaseInPrice = price() * 1.4;
        return increaseInPrice * getRequestedCount();
    }
}
