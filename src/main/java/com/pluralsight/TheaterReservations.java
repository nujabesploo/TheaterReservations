package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner in = new Scanner(System.in);

        // Get user's full name
        System.out.print("Please enter your name: ");
        String fullName = in.nextLine().trim();  // IMPROVEMENT 1: Added trim() for extra spaces

        // Split the full name into first and last name
        String[] nameParts = fullName.split(" ");  // IMPROVEMENT 2: Better variable name

        // IMPROVEMENT 3: Basic name validation
        while (nameParts.length < 2) {
            System.out.print("Please enter both your first and last name: ");
            fullName = in.nextLine().trim();
            nameParts = fullName.split(" ");
        }

        String firstName = nameParts[0];  // IMPROVEMENT 4: camelCase naming
        String lastName = nameParts[nameParts.length - 1];  // IMPROVEMENT 5: Handle middle names

        // Get show date from user
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = in.nextLine().trim();  // IMPROVEMENT 6: Better variable name

        // IMPROVEMENT 7: Parse date using DateTimeFormatter directly
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // IMPROVEMENT 8: Parse date directly without manual splitting
        LocalDate showDate = LocalDate.parse(dateInput, inputFormatter);

        // Get number of tickets
        System.out.print("How many tickets would you like? ");
        int tickets = in.nextInt();

        // IMPROVEMENT 9: Better output formatting with correct spacing
        if (tickets > 1) {
            System.out.printf("%d tickets reserved for %s under %s, %s%n",
                    tickets,
                    showDate.format(outputFormatter),  // IMPROVEMENT 10: Format date properly
                    lastName,
                    firstName);
        } else {
            System.out.printf("%d ticket reserved for %s under %s, %s%n",
                    tickets,
                    showDate.format(outputFormatter),
                    lastName,
                    firstName);
        }

        in.close();
    }
}