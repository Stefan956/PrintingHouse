package com.company;

import java.util.List;

public class Finances {

    private List<Book> books;
    private List<Employee>employees;

    public Finances(List<Book> books, List<Employee> employees) {

        this.books = books;
        this.employees = employees;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double sumBookExpenses(){
        double sum =0;
        for (var book : books) {
            sum += book.price() * book.getRequestedCount();
        }
        return sum;
    }

    public double sumBookIncome(){
        double income = 0;
        for ( var book :  books){
            income += book.calculateBookIncome();
        }
        return income;
    }

    public void SumSalary(){
        double bonus = 0;
        double managerBonus=0;

        for(var employee : employees){
            double brute = employee.getSalary();
            bonus += brute;
        }
        double tmp = sumBookIncome() - (sumBookExpenses() + bonus);
        if ( tmp > 0) {
            managerBonus += tmp;
            var printManagerBonus = String.format("Managers should divide %.2f between them", managerBonus);
            System.out.println(printManagerBonus);
        }
        var PrintRegular = String.format("Salary expenses are :  %.2f", bonus);
        System.out.println(PrintRegular);
    }

    public void info(){
        var printSum = String.format("Book consumatives cost: %.2f", sumBookExpenses());
        System.out.println(printSum);

        var printWin = String.format("Income: %.2f", sumBookIncome());
        System.out.println(printWin);
    }


    @Override
    public String toString() {
        return "BookIncomeOutcome{" +
                "books=" + books +
                ", employees=" + employees +
                '}';
    }
}
