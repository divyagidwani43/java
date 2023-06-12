package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount a= new BankAccount("ABC","BAOO1");
        a.showMenu();
    }
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cname, String cid){
        customerName= cname;
        customerID = cid;
    }

    void deposit(int amount){
        if (amount != 0){
            balance=balance+amount;
            previousTransaction=amount;
        }
    }
    void withdraw(int amount){
        if (amount != 0){
            balance=balance-amount;
            previousTransaction=-amount;
        }
    }
    void getPreviousTransaction(){
        if (previousTransaction>0) {
            System.out.println("deposited : " + previousTransaction);
        }
        if (previousTransaction<0){
            System.out.println("withdrawn : "+previousTransaction);
        }
        else
            System.out.println("no transaction");
    }

    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome "+customerName);
        System.out.println("your ID is "+ customerID);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Check Balance");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("enter an option");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("balance = " + balance);
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("enter an amount to be withdrawn: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    getPreviousTransaction();
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("invalid option! Please enter again");
                    break;

            }
        }
        while(option != 'E');
        System.out.println("thank you for using our services");

    }
}



