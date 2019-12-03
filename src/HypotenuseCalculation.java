import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first side");
        double firstSide = input.nextDouble();
        System.out.println("Enter second side");
        double secondSide = input.nextDouble();

        System.out.printf("\nLength of hypotenuse is %.2f", getHypotenuse(firstSide, secondSide));
        System.out.printf("\nLength of hypotenuse is %.2f", calculateHypotenuse(firstSide, secondSide));

    }

    public static double getHypotenuse(double firstSide, double secondSide) {
        return Math.hypot(firstSide, secondSide);
    }

    public static double calculateHypotenuse(double firstSide, double secondSide) {
        return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
    }
}
