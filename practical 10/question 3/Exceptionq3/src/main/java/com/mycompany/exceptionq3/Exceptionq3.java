/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionq3;

/**
 *
 * @author user
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exceptionq3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
