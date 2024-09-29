package Homework3;

public class Car {

    private int year;
    private int price;
    private boolean isSportsCar;
    private double fuelTankCapacity;
    private double freeFuel;
    private String engineFuelOperationSystem;

    public Car(int year, int price, boolean isSportsCar, double fuelTankCapacity, double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportsCar = isSportsCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        this.engineFuelOperationSystem = newEngineFuelOperationSystem;
        System.out.println(newEngineFuelOperationSystem);
    }

    public void useFuel(double fuel) {

        if (fuel > freeFuel) {
            System.out.println("Not enough fuel");
        } else {
            freeFuel -= fuel;
            System.out.println("Used fuel: " + fuel + "Free fuel: " + freeFuel);
        }

       }

    public String toString() {
        return "Car [year=" + year + ", price=" + price + ", isSportsCar=" + isSportsCar + ", fuelTankCapacity=" + fuelTankCapacity + ", freeFuel=" + freeFuel + ", engineFuelOperationSystem=" + engineFuelOperationSystem + "]";
    }

}
