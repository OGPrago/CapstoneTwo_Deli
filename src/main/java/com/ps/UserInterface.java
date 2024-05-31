package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);
    static Order order = new Order();

    public static void display() {
        homeScreen();
    }

    private static void homeScreen() {
        String homeCommand = "";

        do {
            AsciiArt.satriales();
            System.out.println("Welcome to Satriale's!");
            System.out.println("Select an option:");
            System.out.println("\t1) New Order");
            System.out.println("\t2) Exit");
            homeCommand = scanner.nextLine();

            switch (homeCommand) {
                case "1":
                    orderScreen();
                    break;
                case "2":
                    System.out.println("Bye Bye!");
                    break;
                case "Gabagool99$": // WIP: Admin menu
                    adminMenu();
                    break;
                default:
                    missInput();
                    break;
            }

        } while (!homeCommand.equalsIgnoreCase("2"));

    }

    private static void adminMenu() {
        byte adminCommand = 0;

        do {
            System.out.println("Access Granted.");
            System.out.println("\t1) Display Recipts");
            System.out.println("\t2) Back");
            try {
                adminCommand = scanner.nextByte();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Misinput? ¬‿¬");
                scanner.next();
                continue;
            }

            switch (adminCommand) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } while (adminCommand != 2);

    }

    private static void orderScreen() {
        byte orderCommand = 0;

        do {
            System.out.println("Select an option:");
            System.out.println("\t1) Add Sandwich");
            System.out.println("\t2) Add Drink");
            System.out.println("\t3) Add Chips");
            System.out.println("\t4) Checkout");
            System.out.println("\t5) Cancel Order");
            try {
                orderCommand = scanner.nextByte();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Misinput? ¬‿¬");
                scanner.next();
                continue;
            }

            switch (orderCommand) {
                case 1:
                    processSandwich();
                    break;
                case 2:
                    processDrink();
                    break;
                case 3:
                    processChips();
                    break;
                case 4:
                    processCheckout();
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
        scanner.nextLine();

        System.out.print("Select bread size (1: 4\", 2: 8\", 3: 12\"): ");
        int breadSizeOption = scanner.nextInt();

        System.out.print("Select bread type (1: white, 2: wheat, 3: rye, 4: wrap): ");
        int breadTypeOption = scanner.nextInt();

        System.out.print("Select meat type (1: steak, 2: ham, 3: salami, 4: roast beef, 5: chicken, 6: bacon, 7: gabagool): ");
        int meatTypeOption = scanner.nextInt();

        System.out.print("Do you want extra meat? (1: yes, 2: no): ");
        int extraMeatOption = scanner.nextInt();
        boolean extraMeat;
        if (extraMeatOption == 1) {
            extraMeat = true;
        } else {
            extraMeat = false;
        }

        System.out.print("Select cheese type (1: american, 2: provolone, 3: cheddar, 4: swiss): ");
        int cheeseTypeOption = scanner.nextInt();

        System.out.print("Do you want extra cheese? (1: yes, 2: no): ");
        int extraCheeseOption = scanner.nextInt();
        boolean extraCheese;
        if (extraCheeseOption == 1) {
            extraCheese = true;
        } else {
            extraCheese = false;
        }

        System.out.print("Select regular toppings (1: lettuce, 2: peppers, 3: onions, 4: tomatoes, 5: jalapenos, 6: cucumbers, 7: pickles, 8: guacamole, 9: mushrooms): ");
        int regularToppingsOption = scanner.nextInt();

        System.out.print("Select sauces (1: ketchup, 2: ranch, 3: thousand islands, 4: vinaigrette, 5: mayo, 6: mustard): ");
        int saucesOption = scanner.nextInt();

        System.out.print("Select sides (1: au jus, 2: sauce): ");
        int sidesOption = scanner.nextInt();

        String breadSize = getBreadSizeFromOption(breadSizeOption);
        String breadType = getBreadTypeFromOption(breadTypeOption);
        String meatType = getMeatTypeFromOption(meatTypeOption);
        String cheeseType = getCheeseTypeFromOption(cheeseTypeOption);
        String regularToppings = getRegularToppingsFromOption(regularToppingsOption);
        String sauces = getSaucesFromOption(saucesOption);
        String sides = getSidesFromOption(sidesOption);

        Sandwich sandwich = new Sandwich(breadSize, breadType, meatType, extraMeat, cheeseType, extraCheese, regularToppings, sauces, sides);
        order.add(sandwich);
    }

    private static String getBreadSizeFromOption(int option) {
        switch (option) {
            case 1:
                return "4\"";
            case 2:
                return "8\"";
            case 3:
                return "12\"";
            default:
                return "";
        }
    }

    private static String getBreadTypeFromOption(int option) {
        switch (option) {
            case 1:
                return "white";
            case 2:
                return "wheat";
            case 3:
                return "rye";
            case 4:
                return "wrap";
            default:
                return "";
        }
    }

    private static String getMeatTypeFromOption(int option) {
        switch (option) {
            case 1:
                return "steak";
            case 2:
                return "ham";
            case 3:
                return "salami";
            case 4:
                return "roast beef";
            case 5:
                return "chicken";
            case 6:
                return "bacon";
            case 7:
                return "gabagool";
            default:
                return "";
        }
    }

    private static String getCheeseTypeFromOption(int option) {
        switch (option) {
            case 1:
                return "american";
            case 2:
                return "provolone";
            case 3:
                return "cheddar";
            case 4:
                return "swiss";
            default:
                return "";
        }
    }

    private static String getRegularToppingsFromOption(int option) {
        switch (option) {
            case 1:
                return "lettuce";
            case 2:
                return "peppers";
            case 3:
                return "onions";
            case 4:
                return "tomatoes";
            case 5:
                return "jalapenos";
            case 6:
                return "cucumbers";
            case 7:
                return "pickles";
            case 8:
                return "guacamole";
            case 9:
                return "mushrooms";
            default:
                return "";
        }
    }

    private static String getSaucesFromOption(int option) {
        switch (option) {
            case 1:
                return "ketchup";
            case 2:
                return "ranch";
            case 3:
                return "thousand islands";
            case 4:
                return "vinaigrette";
            case 5:
                return "mayo";
            case 6:
                return "mustard";
            default:
                return "";
        }
    }

    private static String getSidesFromOption(int option) {
        switch (option) {
            case 1:
                return "au jus";
            case 2:
                return "sauce";
            default:
                return "";
        }
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
        order.checkOut();
        System.out.println("Would you like to checkout(y/n)?");
        String checkoutCommand = scanner.nextLine();
        if (checkoutCommand.equalsIgnoreCase("y")) {
            FileManager.writeRecipt();
            homeScreen();
        } else {
            homeScreen();
        }

    }

    private static void missInput() {
        AsciiArt.anya();
        System.out.println("Missinput?");
    }


}
