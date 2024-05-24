package com.ps;

import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void display() {
        homeScreen();
    }

    private static void homeScreen(){
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
                    break;
                case 2:
                    break;
                default:
                    break;
            }

        } while (homeCommand != 2);

    }

}
