/*
* This class use inheritance.
*
* @author  Jay Lee
* @version 1.3
* @since   2021-06-01
*/
// package ca.mths.unit2.unit09.java.bike;

public class Bike extends Vehicle {
    /** Field : cadence. */
    private int cadence = 0;
    /** Field : gears. */
    private int gears;

    /** number of bike tires. */
    private static final int NUM_OFTIRES = 2;

    /**
    * This constructor is Vehicle class's sub class.
    * @param initColour
    * @param initMaxSpeed
    * @param initGears
    */
    public Bike(final String initColour, final int initMaxSpeed,
                                         final int initGears) {
        super(initColour, initMaxSpeed, NUM_OFTIRES);
        this.gears = initGears;
    }

    /**
    * This method prints to console all the properties of the bike.
    */
    public void printVehicleInfo() {
        super.printVehicleInfo();
        System.out.println("Gears: " + getGears());
    }

    /**
    * This method returns string ring bell.
    * @return string
    */
    public String ringBell() {
        return "The bell rings!";
    }

    /**
    * This method returns the cadence.
    * @return cadence
    */
    public int getCadence() {
        return cadence;
    }

    /**
    * This method returns the gears.
    * @return gears
    */
    public int getGears() {
        return gears;
    }

    /**
    * This method sets the gears.
    * @param newGears
    */
    public void setGeas(final int newGears) {
        this.gears = newGears;
    }
}
