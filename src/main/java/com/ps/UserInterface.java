package com.ps;

import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void display() {
        homeScreen();
    }

    private static void homeScreen() {
        byte homeCommand;

        do {
            AsciiArt.satriales();
            System.out.println("Welcome to Satriale's!");
            System.out.println("Select an option:");
            System.out.println("\t1) New Order");
            System.out.println("\t2) Exit");
            homeCommand = scanner.nextByte();

            switch (homeCommand) {
                case 1:
                    orderScreen();
                    break;
                case 2:
                    break;
                default:
                    AsciiArt.anya();
                    System.out.println("Missinput?");
                    break;
            }

        } while (homeCommand != 2);

    }

    private static void orderScreen() {
        byte orderCommand;

        do {
            System.out.println("Select an option:");
            System.out.println("\t1) Add Sandwich");
            System.out.println("\t2) Add Drink");
            System.out.println("\t3) Add Chips");
            System.out.println("\t4) Checkout");
            System.out.println("\t5) Cancel Order");
            orderCommand = scanner.nextByte();

            switch (orderCommand) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Canceling Order.");
                    break;
                default:
                    AsciiArt.anya();
                    System.out.println("Missinput?");
                    break;
            }

        } while (orderCommand != 5);
    }

    private static void processSandwich() {

    }

    private static void processDrink() {

    }

    private static void processChips() {

    }

    private static void processCheckout() {

    }

}
