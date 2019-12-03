import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the side of square ");
        int lengthOfSide = input.nextInt();
        System.out.println("Enter fill character ");
        char fill = input.next().charAt(0);
        displayASquare(lengthOfSide,fill);

    }

    public static void displayASquare(int lengthOfSide, char fill) {
        for (int i = 0; i < lengthOfSide; i++) {
            System.out.println();
            for (int j = 0; j < lengthOfSide; j++)
                System.out.printf("%c", fill);
        }
    }
}
