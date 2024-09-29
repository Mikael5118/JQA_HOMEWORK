package Homework3;

public class CarPerson {
    public static void main(String[] args) {
        Car car1;
        Car car2;
        car1 = new Car(2000, 10000, true, 60, 40, "diesel");
        car2 = new Car(2017, 40000, false, 55, 10, "gasoline");

        car1.useFuel(35);
        car2.changeEngineFuelOperationSystem("diesel");

        System.out.println(car1);
        System.out.println(car2);

    }
}
