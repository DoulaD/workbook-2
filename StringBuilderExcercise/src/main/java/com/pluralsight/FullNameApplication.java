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


        StringBuilder fullName = new StringBuilder();

        fullName.append(firstName);

        if (!lastName.isEmpty()){
        fullName.append(" ").append(lastName);
        }
        if (!Suffix.isEmpty());
        fullName.append(", ").append(Suffix);

        System.out.println("Full Name: " + fullName);








    }
}
