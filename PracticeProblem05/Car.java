package PracticeProblem05;

public class Car {
    private String ownerName;
    private String brandName;
    private String serialNumber;
    private boolean state;
    private int fuel;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void displayCar(){
        System.out.println("Details for this car: ");
        System.out.println("Owner name: "+ownerName);
        System.out.println("Brand name: "+brandName);
        System.out.println("Serial number: "+serialNumber);
        System.out.println("Start the car? "+state);
        System.out.println("Fuel - "+fuel+"%");
    }
}
