package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(EmployeeType.MANAGER));
        employees.add(new Employee(EmployeeType.OPERATOR));
        employees.add(new Employee(EmployeeType.OPERATOR));
        employees.add(new Employee(EmployeeType.OPERATOR));
        employees.add(new Employee(EmployeeType.OPERATOR));
        employees.add(new Employee(EmployeeType.OPERATOR));
        employees.add(new Employee(EmployeeType.MANAGER));

        Book LOTR = new Book(10, "Lord of The Rings", 3000, PaperSize.А3, IssueType.MAGAZINE);
        Book HP = new Book(10, "Harry Potter", 3000, PaperSize.А3 , IssueType.NEWSPAPER);
        List<Book> books = new ArrayList<>();

        books.add(HP);
        books.add(LOTR);

        Finances ind = new Finances(books, employees);
        ind.info();
        ind.SumSalary();

        List<PrintingPress> printingPresses = new ArrayList<>();
        printingPresses.add(new PrintingPress (PageColor.BLACKWHITE, 3000, 100));
        printingPresses.add(new PrintingPress(PageColor.COLORFUL, 3000, 100));
        printingPresses.add(new PrintingPress (PageColor.BLACKWHITE, 3000, 100));


        PrintingHouse ph = new PrintingHouse(employees, printingPresses);
        ph.startPrinting(HP);
        ph.startPrinting(LOTR);


    }
}
