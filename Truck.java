/*
* This class uses inheritance.
*
* @author  Jay Lee
* @version 1.3
* @since   2021-06-01
*/
// package ca.mths.unit2.unit09.java.truck;

public class Truck extends Vehicle {
    /** Field : License plate number. */
    private String licensePlateNumber;
    /** Field : volume of cube van. */
    private double volumeOfCubeVan;

    /**
    * This calls the contructor of Vehicle, Truck's superClass.
    * @param initLicensePlateNumber
    * @param initColour
    * @param initMaxSpeed
    * @param numberOfTires
    * @param initVolumeOfCubeVan
    */
    public Truck(final String initLicensePlateNumber, final String initColour,
                 final int initMaxSpeed, final int numberOfTires,
                 final double initVolumeOfCubeVan) {
        super(initColour, initMaxSpeed, numberOfTires);
        this.licensePlateNumber = initLicensePlateNumber;
        this.volumeOfCubeVan = initVolumeOfCubeVan;
    }

    /**
    * This method prints to console all the properties of the bike.
    */
    public void printVehicleInfo() {
        super.printVehicleInfo();
        System.out.println("License plate number: " + getLicensePlateNumber());
        System.out.println("Volume of the cube van: " + getVolumeOfCubeVan());
    }

    /**
    * This method returns amout of air.
    * @param amountOfAir
    * @return amountOfAir
    */
    public int provideAir(final int amountOfAir) {
        return amountOfAir;
    }

    /**
    * This method returns the license plate number.
    * @return licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
    * This method returns the license plate number.
    * @return volume
    */
    public double getVolumeOfCubeVan() {
        return volumeOfCubeVan;
    }


    /**
    * This method gets new license plate number and sets it.
    * @param newLicensePlateNumber
    */
    public void setLicensePlateNumber(final String newLicensePlateNumber) {
        this.licensePlateNumber = newLicensePlateNumber;
    }

}
