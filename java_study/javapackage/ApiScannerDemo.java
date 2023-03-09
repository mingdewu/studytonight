package javapackage;

import java.util.Scanner;

public class ApiScannerDemo {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            String userName;
            // Enter username and press Enter
            System.out.println("Enter username");
            userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }
    }
}
