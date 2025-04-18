package com.github.danielcraignicholson;

public class Expenses {

  private double bills = 0;
  private double groceries = 0;
  private double miscellaneous = 0;

  public double totalExpenses() {
    return bills + groceries + miscellaneous;
  }

  public void setBills(double bills) {
    this.bills = bills;
  }

  public void setGroceries(double groceries) {
    this.groceries = groceries;
  }

  public void setMiscellaneous(double miscellaneous) {
    this.miscellaneous = miscellaneous;
  }
}
