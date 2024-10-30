package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {

        Computer computer1 = new Computer(2019, 1500.35, "Windows 11");
        Computer computer2 = new Computer(2024, 2999.99, "Windows 11");

        int comparisonResult = computer1.comparePrice(computer2);

        if (comparisonResult == -1) {
            System.out.println("The price of the first computer is higher.");
        } else if (comparisonResult == 1) {
            System.out.println("The price of the second computer is higher.");
        } else {
            System.out.println("First computer and second computer have equal prices.");
        }
    }
}
