package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = myScanner.nextLine();

        // Prompt user for billing address
        StringBuilder addressInfo = new StringBuilder();
        System.out.print("Your billing street address: ");
        String billingStreet = myScanner.nextLine();
        System.out.print("Your billing city: ");
        String billingCity = myScanner.nextLine();
        System.out.print("Your billing State: ");
        String billingState = myScanner.nextLine();
        System.out.print("Your billing zip code: ");
        String billingZipCode = myScanner.nextLine();
        addressInfo.append("Billing Address: \n")
                .append(billingStreet).append("\n")
                .append(billingCity).append("\n")
                .append(billingState).append("\n")
                .append(billingZipCode).append("\n");

        // Prompt user for shipping address
        System.out.print("Your shipping street address: ");
        String shippingStreet = myScanner.nextLine();
        System.out.print("Your shipping city: ");
        String shippingCity = myScanner.nextLine();
        System.out.print("Your shipping state: ");
        String shippingState = myScanner.nextLine();
        System.out.print("Your shipping zip code: ");
        String shippingZipCode = myScanner.nextLine();
        addressInfo.append("Shipping Address: \n")
                .append(shippingStreet).append("\n")
                .append(shippingCity).append(", ")
                .append(shippingState).append("\n")
                .append(shippingZipCode);

        myScanner.close();

        System.out.println("\n Address Information:");
        System.out.print(addressInfo.toString());







    }
}
