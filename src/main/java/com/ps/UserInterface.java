package com.ps;

import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);
    static Order order = new Order();

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
                    missInput();
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
                    processChips();
                    break;
                case 4:
                    order.checkOut();
                    break;
                case 5:
                    System.out.println("Canceling Order.");
                    order = new Order();
                    break;
                default:
                    missInput();
                    break;
            }

        } while (orderCommand != 5);
    }

    private static void processSandwich() {

    }

    private static void processDrink() {

    }

    private static void processChips() {
        byte chipsCommand;

        do {
            System.out.println("Chips");
            System.out.println("Select an option:");
            System.out.println("\t1) Lays Classic (small) - $1.50");
            System.out.println("\t2) Ruffles Classic (small) - $1.50");
            System.out.println("\t3) Fritos Original (small) - $1.50");
            System.out.println("\t4) Back to Order Menu");
            chipsCommand = scanner.nextByte();

            switch (chipsCommand) {
                case 1:
                    order.add(new Chips(1.50f, "Lays Classic", "small"));
                    break;
                case 2:
                    order.add(new Chips(1.50f, "Ruffles Classic", "small"));
                    break;
                case 3:
                    order.add(new Chips(1.50f, "Fritos Original", "small"));
                    break;
                case 4:
                    break;
                default:
                    missInput();
                    break;
            }

        } while (chipsCommand != 4);
    }

    private static void processCheckout() {

    }

    // Maybe
    private static void orderFormat() {

    }

    private static void missInput() {
        AsciiArt.anya();
        System.out.println("Missinput?");
    }

}
