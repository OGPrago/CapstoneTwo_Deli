package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.ps.UserInterface.order;

public class FileManager {

    public static void writeRecipt() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String fileName = dateFormat.format(new Date()) + ".txt";
        String directory = "C:\\Users\\Owner\\LearnToCode\\Capstones\\CapstoneTwo_Deli\\recipts";

        try {
            Files.createDirectories(Paths.get(directory));
        } catch (IOException e) {
            System.err.println("Error creating directory: " + e.getMessage());
            return;
        }

        String filePath = Paths.get(directory, fileName).toString();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write("Order Details:\n");
            for (Product product : order.products) {
                bufferedWriter.write(product.getName() + " - $" + product.calcPrice() + "\n");
            }
            bufferedWriter.write("Total Price: $" + order.calculateTotalPrice());
            System.out.println("Receipt written to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing receipt to file: " + e.getMessage());
        }
    }

    public static void readRecipt() {

    }
}

