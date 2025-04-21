package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.print("FullName: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();


        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();


        StringBuilder addresses  = new StringBuilder();


        addresses.append("Billing Address:\n");
        addresses.append(billingStreet).append("\n");
        addresses.append(billingCity).append(", ")
                .append(billingState).append(" ")
                .append(billingZip).append("\n\n");

        addresses.append("Shipping Address:\n");
        addresses.append(shippingStreet).append("\n");
        addresses.append(shippingCity).append(", ")
                .append(shippingState).append(" ")
                .append(shippingZip);

        System.out.println("\n" + addresses);
        System.out.println(addresses);


    }
}
