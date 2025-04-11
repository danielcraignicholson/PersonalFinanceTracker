package com.github.danielcraignicholson;

import java.text.DecimalFormat;

public class Expenses {

    DecimalFormat decimalFormat = new DecimalFormat("0.00"); //format to 2 decimal places

    private double bills = 0;
    private double groceries = 0;
    private double miscellaneous = 0;

    public String totalExpenses() {
        return decimalFormat.format(bills + groceries + miscellaneous);
    }

    public double getBills() {
        return bills;
    }

    public void setBills(double bills) {
        this.bills = bills;
    }

    public double getGroceries() {
        return groceries;
    }

    public void setGroceries(double groceries) {
        this.groceries = groceries;
    }

    public double getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(double miscellaneous) {
        this.miscellaneous = miscellaneous;
    }
}
