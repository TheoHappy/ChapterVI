import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many customers do you have in the garage ?");
        int numberOfCustomers = input.nextInt();
        double yesterdayReceipts = 0;

        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.printf("How many auto of customer n#%d stayed parked ",i+1);
            double hoursParked = input.nextDouble();
            System.out.println(calculateCharges(Math.ceil(hoursParked)));
            yesterdayReceipts += calculateCharges(Math.ceil(hoursParked));
        }
        System.out.printf("Total of yesterday's receipts is %.2f",yesterdayReceipts);
    }

    public static double calculateCharges(double hoursParked) {
        double result = 0.0;
        if (hoursParked <= 3)
            result = 2;
        if (hoursParked > 3)
            result = 2 + (hoursParked - 3) * 0.5;
        if (result > 10)
            result = 10;
        return result;
    }
}
