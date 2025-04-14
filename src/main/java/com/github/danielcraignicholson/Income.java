package com.github.danielcraignicholson;

public class Income {

    private double salary = 0;
    private double rent = 0;
    private double childBenefit = 0;

    public double totalIncome() {
        return salary + rent + childBenefit;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public void setChildBenefit(double childBenefit) {
        this.childBenefit = childBenefit;
    }
}
