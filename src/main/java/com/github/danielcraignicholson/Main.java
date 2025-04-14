package com.github.danielcraignicholson;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("0.00"); //format to 2 decimal places

        System.out.println("Hello, welcome to your Personal Finance Tracker (PFT)!");
        System.out.println("Let's add some transactions and work out your current balance for this month.");
        System.out.print("Press 1 to enter income, press 2 to enter expenses or press 3 to view current balance: ");

        Scanner scanner = new Scanner(System.in);
        Income income = new Income();
        Expenses expenses = new Expenses();

        int choice = scanner.nextInt();

        while (choice != 3) {

            if (choice == 1) {

                System.out.print("Enter salary: ");
                income.setSalary(scanner.nextDouble());

                System.out.print("Enter rent: ");
                income.setRent(scanner.nextDouble());

                System.out.print("Enter childBenefit: ");
                income.setChildBenefit(scanner.nextDouble());

                System.out.println("Total income: " + decimalFormat.format(income.totalIncome()));
            }

            if (choice == 2) {

                System.out.print("Enter bills: ");
                expenses.setBills(scanner.nextDouble());

                System.out.print("Enter groceries: ");
                expenses.setGroceries(scanner.nextDouble());

                System.out.print("Enter miscellaneous: ");
                expenses.setMiscellaneous(scanner.nextDouble());

                System.out.println("Total expenses: " + decimalFormat.format(expenses.totalExpenses()));
            }

            System.out.print("Press 1 to enter income, press 2 to enter expenses or press 3 to view current balance: ");
            choice = scanner.nextInt();
        }

        System.out.println("Balance: " + decimalFormat.format(income.totalIncome() - expenses.totalExpenses()));

    }
}