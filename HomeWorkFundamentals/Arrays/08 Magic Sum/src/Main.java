import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();
        String[] ArrayOfLine = Line.split(" ");
        int[] ArrayOfDigits = new int[ArrayOfLine.length];
        for (int i = 0; i < ArrayOfDigits.length; i++) {
            ArrayOfDigits[i] = Integer.parseInt(ArrayOfLine[i]);
        }
        long Digit = sc.nextInt();
        boolean IsSum = false;
        for (int i = 0; i < ArrayOfDigits.length; i++) {
            for (int j = i; j < ArrayOfDigits.length; j++) {
                if (ArrayOfDigits[i] + ArrayOfDigits[j] == Digit) {
                    System.out.printf("%d%s%d\n", ArrayOfDigits[i], " ", ArrayOfDigits[j]);
                    IsSum = true;

                }
            }
        }
        if (IsSum == false) {
            System.out.print(0);
        }
    }
}
