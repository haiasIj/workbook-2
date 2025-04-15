package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Your First Name:");
        String firstName = String.valueOf(scanner.next());
        System.out.print("Enter Your Middle Initial:");
        String middleInitial = String.valueOf(scanner.next());
        System.out.print("Enter Your Last Name:");
        String lastName = String.valueOf(scanner.next());
        System.out.print("Enter suffix (Optional):");
        String suffix = String.valueOf(scanner.next());

        String fullName = (firstName + middleInitial + lastName +  suffix);

        System.out.println("Full Name:" + fullName);




    }
}
