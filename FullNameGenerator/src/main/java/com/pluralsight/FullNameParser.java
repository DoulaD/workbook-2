package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Your Name (First Last or First Middle Last): ");
        String fullName = scanner.nextLine().trim();
        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 2) {
            System.out.println("First Name: " + nameParts[0]);
            System.out.println("Last Name: " + nameParts[1]);
        } else if (nameParts.length == 3){
            System.out.println("First Name: " + nameParts[0]);
            System.out.println("Middle Name: " + nameParts[1]);
            System.out.println("Last Name: " + nameParts[2]);
        } else { System.out.println("Invalid Name Format. Please enter either (first last or first middle last.)");
        }
        System.out.println("Thank you for entering your name!");

    }
}
