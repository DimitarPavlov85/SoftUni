import java.util.Scanner;

public class Main {
    public static int SumOfDigits(int Number) {
        int Result = 0;
        while (Number > 0) {
            Result += Number % 10;
            Number = Number / 10;
        }
        return Result;
    }

    public static boolean isOdd(int Number) {
        boolean isodd = false;
        while (Number > 0) {
            int CurrentDigit = Number / 10;
            if (CurrentDigit % 2 != 0) {
                isodd = true;
            }
            Number = Number / 10;
        }
        return isodd;
    }

    public static void PrintTopNumberInRange(int Number) {

        for (int i = 1; i < Number; i++) {
            int current = SumOfDigits(i);
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
