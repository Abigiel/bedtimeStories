package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class BedtimeStories {


    public static void main(String[] args) {

        try {

            System.out.println("Please choose a poem to display: \n (1) Goldilocks \n (2) Hansel and Gretel \n (3) Mary had a Little Lamb");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");
            FileInputStream fis1 = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
            FileInputStream fis2 = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");


            Scanner myScanner = new Scanner(fis);
            Scanner myScanner1 = new Scanner(fis1);
            Scanner myScanner2 = new Scanner(fis2);

            switch (choice) {

                case 1:
                    while (myScanner.hasNextLine()) {
                        String input = myScanner.nextLine();
                        System.out.println(input);
                    }
                break;
//                    myScanner.close();

                case 2:
                    while (myScanner1.hasNextLine()) {
                        String input1 = myScanner.nextLine();
                        System.out.println(input1);
                    }
                break;
//                myScanner1.close();

                case 3:
                    while (myScanner2.hasNextLine()) {
                        String input2 = myScanner.nextLine();
                        System.out.println(input2);
                    }
                break;

//                myScanner2.close();
//
            if (myScanner != null) {
                    while (myScanner.hasNextLine()) {
                        String input = myScanner.nextLine();
                        System.out.println(input);
                    }

                    myScanner.close();
                    fis.close();
                }

                default:
                    System.out.println("Invalid input. Select 1-3.");

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}