
package com.vehicalrental;

import java.util.Scanner;

public class UseVehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        double totalRent = 0;

        // Loop through each vehicle
        for (int i = 0; i < n; i++) {

            System.out.print("Enter type (1-Car, 2-Bike): ");
            int type = sc.nextInt();

            // Keep asking until type is 1 or 2
            while (type != 1 && type != 2) {
                System.out.println("Invalid vehicle type. Try again.");

                System.out.print("Enter type (1-Car, 2-Bike): ");
                type = sc.nextInt();
            }

            System.out.print("Enter Vehicle Number: ");
            String vehicleNumber = sc.next();

            System.out.print("Enter Model: ");
            String model = sc.next();

            System.out.print("Enter Rate per Day: ");
            double ratePerDay = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();

            if (type == 1) {

                System.out.print("Enter Insurance per Day: ");
                double insurance = sc.nextDouble();

                Vehicle v = new Car(vehicleNumber, model,
                                    ratePerDay, days, insurance);

                vehicles[i] = v;

            } else {

                Vehicle v = new Bike(vehicleNumber, model,
                                     ratePerDay, days, 10);

                vehicles[i] = v;
            }
        }

        System.out.println("\n--- Rental Details ---");

        for (Vehicle v : vehicles) {
            System.out.println(v.displayDetails());
            totalRent += v.calculateRent();
        }

        System.out.println("Total Rent Collected: " + totalRent);

        sc.close();
    }
}
