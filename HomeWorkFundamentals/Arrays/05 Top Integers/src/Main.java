import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String LineOfStrings = sc.nextLine();
        String[] ArrayOfStrings = LineOfStrings.split(" ");
        int[] ArrayOfDigits = new int[ArrayOfStrings.length];
        for (int i = 0; i < ArrayOfDigits.length; i++) {
            ArrayOfDigits[i] = Integer.parseInt(ArrayOfStrings[i]);
        }
        int Startindex = 0;
        int MaxValue=ArrayOfDigits[0];
        for (int i = 1; i < ArrayOfDigits.length; i++) {
            if (MaxValue < ArrayOfDigits[i]) {
                Startindex = i;
                MaxValue=ArrayOfDigits[i];
            }
        }

        for (int i = Startindex; i < ArrayOfDigits.length - 1; i++) {
            if (ArrayOfDigits[i] > ArrayOfDigits[i + 1]) {
                System.out.printf("%d%s", ArrayOfDigits[i], " ");
            }
        }
        System.out.print(ArrayOfDigits[ArrayOfDigits.length - 1]);


    }
}
