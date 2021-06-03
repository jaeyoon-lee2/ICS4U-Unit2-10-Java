/*
* This program uses the Vehicle class,  Truck and Bike subClass.
*
* @author  Jay Lee
* @version 1.3
* @since   2021-06-01
*/
// package ca.mths.unit2.unit09.java.vehicleForm;

import java.util.Scanner;

public final class VehicleForm {
    private VehicleForm() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method get constructor input and commands.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        try {
            // Create truck object
            System.out.println("Truck:");
            System.out.print("Enter the license plate number: ");
            String licensePlateNumber = myObj.nextLine();
            System.out.print("Enter the number of tires: ");
            int numberOfTires = Integer.parseInt(myObj.nextLine());
            System.out.print("Enter the volume of the cube van (m^3): ");
            double volumeOfCubeVan = Double.parseDouble(myObj.nextLine());
            System.out.print("Enter the colour: ");
            String colour = myObj.nextLine();
            System.out.print("Enter the max speed (km/h): ");
            int maxSpeed = Integer.parseInt(myObj.nextLine());
            Truck myTruck = new Truck(licensePlateNumber, colour, maxSpeed,
                                      numberOfTires, volumeOfCubeVan);
            System.out.print("\n");
            // Vehicle vehicle = new Vehicle(colour, maxSpeed, numberOfTires);

            // Create bike object
            System.out.println("Bike:");
            System.out.print("Enter the colour: ");
            colour = myObj.nextLine();
            System.out.print("Enter the max speed (km/h): ");
            maxSpeed = Integer.parseInt(myObj.nextLine());
            System.out.print("Enter the gears: ");
            int gears = Integer.parseInt(myObj.nextLine());
            Bike myBike = new Bike(colour, maxSpeed, gears);
            System.out.print("\n");

            String vehicleType = "Truck";

            while (true) {
                System.out.print("\nEnter the command (" + vehicleType
                                 + ") : ");
                String inputString = myObj.nextLine().toUpperCase();
                if (inputString.equals("END")) {
                    break;
                } else if (inputString.equals("TRUCK")) {
                    vehicleType = "Truck";
                } else if (inputString.equals("BIKE")) {
                    vehicleType = "Bike";
                } else if (inputString.equals("ACCELERATE")) {
                    System.out.print("Enter the value to be accelerated"
                                        + "(km/h): ");
                    if (vehicleType.equals("Truck")) {
                        myTruck.accelerate(Integer.parseInt(myObj.nextLine()));
                        System.out.println("Current speed: "
                                            + myTruck.getSpeed() + "km/h");
                    } else {
                        myBike.accelerate(Integer.parseInt(myObj.nextLine()));
                        System.out.println("Current speed: " + myBike.getSpeed()
                                            + "km/h");
                    }
                } else if (inputString.equals("BRAKE")) {
                    System.out.print("Enter the value to be decelerated"
                                        + "(km/h): ");
                    if (vehicleType.equals("Truck")) {
                        myTruck.brake(Integer.parseInt(myObj.nextLine()));
                        System.out.println("Current speed: "
                                            + myTruck.getSpeed() + "km/h");
                    } else {
                        myBike.brake(Integer.parseInt(myObj.nextLine()));
                        System.out.println("Current speed: " + myBike.getSpeed()
                                            + "km/h");
                    }
                } else if (inputString.equals("TIRE")) {
                    System.out.print("The number of tires:");
                    if (vehicleType.equals("Truck")) {
                        System.out.println(myTruck.getNumberOfTires());
                    } else {
                        System.out.println(myBike.getNumberOfTires());
                    }
                } else if (inputString.equals("COLOUR")) {
                    System.out.print("Enter the new colour of the car ");
                    if (vehicleType.equals("Truck")) {
                        System.out.print("(" + myTruck.getColour()
                                         + " -> ?): ");
                        myTruck.setColour(myObj.nextLine());
                    } else {
                        System.out.print("(" + myBike.getColour()
                                         + " -> ?): ");
                        myBike.setColour(myObj.nextLine());
                    }
                } else if (inputString.equals("LICENSE")
                           && vehicleType.equals("Truck")) {
                    System.out.print("Enter the new license plate number ("
                                + myTruck.getLicensePlateNumber() + " -> ?): ");
                    myTruck.setLicensePlateNumber(myObj.nextLine());
                } else if (inputString.equals("AIR")
                           && vehicleType.equals("Truck")) {
                    System.out.print("How much air you provide (kg): ");
                    int amountOfAir = myTruck.provideAir(Integer.parseInt(
                                                         myObj.nextLine()));
                    System.out.println(amountOfAir + "kg of air is provided.");
                } else if (inputString.equals("RING")
                           && vehicleType.equals("Bike")) {
                    System.out.println(myBike.ringBell());
                } else if (inputString.equals("GEARS")
                           && vehicleType.equals("Bike")) {
                    System.out.println("Gears: " + myBike.getGears());
                } else if (inputString.equals("VOLUME")
                           && vehicleType.equals("Truck")) {
                    System.out.println("The volume of the cube van: "
                                     + myTruck.getVolumeOfCubeVan() + "m^3");
                } else {
                    continue;
                }
            }
            System.out.println("\nTruck:");
            myTruck.printVehicleInfo();
            System.out.println("\nBike:");
            myBike.printVehicleInfo();
        } catch (Exception ex) {
            System.err.print("Invalid input.");
        }
        System.out.println("\nDone.");
    }
}
