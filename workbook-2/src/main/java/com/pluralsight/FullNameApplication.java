package com.pluralsight;


import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine() .trim();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine() .trim();

        System.out.println("Suffix" );
        String Suffix = scanner.nextLine() .trim();

        System.out.println("%s %s %s" );

        String fullName = "";
        if (!firstName.isEmpty()){
            fullName = fullName + firstName;

        }




    }
}
