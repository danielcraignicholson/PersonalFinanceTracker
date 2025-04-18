package com.github.danielcraignicholson;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    DecimalFormat decimalFormat = new DecimalFormat("0.00"); // format to 2 decimal places

    System.out.println("Hello, welcome to your Personal Finance Tracker (PFT)!");
    System.out.println(
        "Let's add some transactions and work out your current balance for this month.");
    System.out.print(
        "Press 1 to enter income, press 2 to enter expenses, press 3 to view current balance or press 4 to enter bills: ");

    Scanner scanner = new Scanner(System.in);
    Income income = new Income();
    Expenses expenses = new Expenses();

    int choice = scanner.nextInt();

    while (choice >= 1 || choice < 5) {

      switch (choice) {
        case 1:
          System.out.print("Enter salary: ");
          income.setSalary(scanner.nextDouble());

          System.out.print("Enter rent: ");
          income.setRent(scanner.nextDouble());

          System.out.print("Enter childBenefit: ");
          income.setChildBenefit(scanner.nextDouble());

          System.out.println("Total income: " + decimalFormat.format(income.totalIncome()));

          break;

        case 2:
          System.out.print("Enter bills: ");
          expenses.setBills(scanner.nextDouble());

          System.out.print("Enter groceries: ");
          expenses.setGroceries(scanner.nextDouble());

          System.out.print("Enter miscellaneous: ");
          expenses.setMiscellaneous(scanner.nextDouble());

          System.out.println("Total expenses: " + decimalFormat.format(expenses.totalExpenses()));
          break;

        case 3:
          System.out.println(
              "Balance: " + decimalFormat.format(income.totalIncome() - expenses.totalExpenses()));

        case 4:
          Bills bills = new Bills();

          System.out.print("Enter mortgage: ");
          bills.setMortgage(scanner.nextDouble());
          System.out.print("Enter property management: ");
          bills.setPropertyManagement(scanner.nextDouble());
          System.out.print("Enter service charge: ");
          bills.setServiceCharge(scanner.nextDouble());
          System.out.print("Enter credit card: ");
          bills.setCreditCard(scanner.nextDouble());
          System.out.print("Enter life insurance: ");
          bills.setLifeInsurance(scanner.nextDouble());
          System.out.print("Enter Spotify: ");
          bills.setSpotify(scanner.nextDouble());
          System.out.print("Enter current account: ");
          bills.setCurrentAccount(scanner.nextDouble());
          System.out.print("Total = £" + decimalFormat.format(bills.getTotal()));
      }

      System.out.println(
          "Press 1 to enter income, press 2 to enter expenses, press 3 to view current balance or press 4 to enter bills: ");
      choice = scanner.nextInt();
    }
  }
}
