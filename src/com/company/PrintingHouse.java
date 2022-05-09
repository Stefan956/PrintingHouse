package com.company;

import java.util.List;

public class PrintingHouse {
    private List<Employee> employees;
    private List<PrintingPress> printingPresses;

    public PrintingHouse(List<Employee> employees, List<PrintingPress> printingPresses) {
        this.employees = employees;
        this.printingPresses = printingPresses;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<PrintingPress> getMachines(){
        return printingPresses;
    }

    @Override
    public String toString() {
        return "Fabrica{" +
                ", employees=" + employees +
                ", machines=" + printingPresses +
                '}';
    }

    public void startPrinting(Book bk){
        this.printingPresses
                .forEach(printingPress -> new Thread(() -> printingPress.print(bk)).start());
    }
}
