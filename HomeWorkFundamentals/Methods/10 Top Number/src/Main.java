import java.util.Scanner;

public class Main {
    public static int sumOfDigits(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        return result;
    }

    public static boolean isOdd(int number) {
        boolean isodd = false;
        while (number > 0) {
            int currentDigit = number / 10;
            if (currentDigit % 2 != 0) {
                isodd = true;
            }
            number = number / 10;
        }
        return isodd;
    }

    public static void PrintTopNumberInRange(int number) {

        for (int i = 1; i < number; i++) {
            int current = sumOfDigits(i);
            boolean isodd = isOdd(i);
            if (isodd == true && current % 8 == 0) {
                System.out.println((i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (sc.nextInt());
        PrintTopNumberInRange(number);

    }
}
