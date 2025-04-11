package com.github.danielcraignicholson;

import java.text.DecimalFormat;

public class Income {

    DecimalFormat decimalFormat = new DecimalFormat("0.00"); //format to 2 decimal places

    private double salary = 0;
    private double rent = 0;
    private double childBenefit = 0;

    public String totalIncome() {
        return decimalFormat.format(salary + rent + childBenefit);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getChildBenefit() {
        return childBenefit;
    }

    public void setChildBenefit(double childBenefit) {
        this.childBenefit = childBenefit;
    }
}
