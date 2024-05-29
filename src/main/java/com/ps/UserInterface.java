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
                    processDrink();
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
        byte drinkCommand;

        do {
            System.out.println("Select a drink:");
            System.out.println("\t1) Coke");
            System.out.println("\t2) Sprite");
            System.out.println("\t3) Water");
            System.out.println("\t4) Espresso");
            System.out.println("\t5) Scotch on the Rocks");
            System.out.println("\t6) Back to Order Menu");
            drinkCommand = scanner.nextByte();

            if (drinkCommand >= 1 && drinkCommand <= 5) {
                processDrinkSize(drinkCommand);
            } else if (drinkCommand != 6) {
                missInput();
            }
        } while (drinkCommand != 6);
    }

    private static void processDrinkSize(int drinkCommand) {
        String drinkName = "";
        switch (drinkCommand) {
            case 1:
                drinkName = "Coke";
                break;
            case 2:
                drinkName = "Sprite";
                break;
            case 3:
                drinkName = "Water";
                break;
            case 4:
                drinkName = "Espresso";
                break;
            case 5:
                drinkName = "Scotch on the Rocks";
                break;
        }

        byte sizeCommand;
        do {
            System.out.println("Select a size:");
            System.out.println("\t1) Small - $2.00");
            System.out.println("\t2) Medium - $2.50");
            System.out.println("\t3) Large - $3.00");
            System.out.println("\t4) Back to Drink Menu");
            sizeCommand = scanner.nextByte();

            switch (sizeCommand) {
                case 1:
                    order.add(new Drink(2.00f, drinkName, "Small"));
                    break;
                case 2:
                    order.add(new Drink(2.50f, drinkName, "Medium"));
                    break;
                case 3:
                    order.add(new Drink(3.00f, drinkName, "Large"));
                    break;
                case 4:
                    break;
                default:
                    missInput();
                    break;
            }
        } while (sizeCommand != 4);
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
