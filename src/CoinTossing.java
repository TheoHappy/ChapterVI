import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    private enum Coin {HEAD, TAIL}

    ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*************************Menu************************");
        System.out.println();

        int switcher;
        int tailFrequency = 0;
        int headFrequency = 0;

        do {
            System.out.println("Enter 0 for toss coin / or enter other digit for exit");
            switcher = input.nextInt();
            if (switcher != 0)
                break;
            Coin coinValue = flip();
            System.out.println("Result of coin tossing is " + coinValue);
            if (coinValue == Coin.HEAD) {
                headFrequency++;
            } else {
                tailFrequency++;
            }
        } while (switcher == 0);

        System.out.println("HEAD appears " + headFrequency + " times");
        System.out.println("TAIL appears " + tailFrequency + " times");
    }

    public static Coin flip() {
        SecureRandom randomFlip = new SecureRandom();
        int flipValue = randomFlip.nextInt(2);
        return flipValue == 1 ? Coin.TAIL : Coin.HEAD;
    }
}
