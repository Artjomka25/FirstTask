package com.company;

public class Main {

    public static void main(String[] args) {
        /* task1(3, 5);
        task1(4, 7);
        task2(100);
        task2(4000000);*/

        /*LightBulb lamp = new LightBulb();
        lamp.On();
        lamp.displayInfo();*/

        Account sender = new Account(56421, 500);
        Account recipient = new Account(12341, 1000);
        sender.infoAccountStatus();
        recipient.infoAccountStatus();

        transfer(sender, recipient, 300);
        recipient.infoAccountStatus();
        sender.infoAccountStatus();

        withdraw(sender, 300);
        recipient.infoAccountStatus();
        sender.infoAccountStatus();
        System.out.println();



    }

    public static void transfer(Account sender, Account recipient, int transferAmount) {
        if (sender.transfer(recipient, transferAmount)) {
            System.out.println("Операция перевода средств со счета " + sender.getId() + " прошла успешно");
        } else {
            System.out.println("Операция перевода средств со счета " + sender.getId() + " не может быть выполнена");
        }
    }

    public static void withdraw(Account sender, int withdrawalAmount) {
        if (sender.withdraw(withdrawalAmount)) {
            System.out.println("Операция снятия средств со счета " + sender.getId() + " прошла успешно");
        } else {
            System.out.println("Операция снятия средств со счета " + sender.getId() + "  не может быть выполнена");
        }
    }

    public static void task1(int firstDivisor, int secondDivisor) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % firstDivisor == 0 || i % secondDivisor == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println("----------------");
    }

    public static void task2(int lastNumber) {
        int sum = 0;
        int firstNumber = 1;
        int secondNumber = 2;
        while (firstNumber <= lastNumber) {
            if ((firstNumber % 2) == 0) {
                sum = sum + firstNumber;
            }
            if ((secondNumber % 2) == 0) {
                sum = sum + secondNumber;
            }
            firstNumber = firstNumber + secondNumber;
            secondNumber = secondNumber + firstNumber;
        }
        System.out.println("Сумма чётных значений для чисел до " + lastNumber + " = " + sum);
        System.out.println("----------------");
    }
}