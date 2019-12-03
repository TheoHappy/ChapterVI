import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of a circle ");
        double radius = input.nextDouble();

        System.out.printf("Area of a circle is %.2f", circleArea(radius));
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
