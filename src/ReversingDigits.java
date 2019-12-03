import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = input.nextInt();
        System.out.println(reverseDigits(number));
    }
    public static int reverseDigits(int n){
        int reverseNumber = 0;
        while (n != 0){
            reverseNumber *= 10;
            reverseNumber += n % 10;
            n = n / 10;
        }
        return reverseNumber;
    }
}
