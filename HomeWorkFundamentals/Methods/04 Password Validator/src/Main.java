import java.util.Scanner;

public class Main {
    public static void CheckPassword(String current) {
        boolean isCorrectSymbols = true;
        int countDigits = 0;
        boolean isDiffAlphaBetic = true;
        for (int i = 0; i < current.length(); i++) {
            if (!Character.isLetterOrDigit(current.charAt(i))) {
                isDiffAlphaBetic = false;
                break;
            }
        }
        if (isDiffAlphaBetic == false) {
            System.out.print("Password must consist only of letters and digits\n");
            isCorrectSymbols = false;
        }
        if (current.length() < 6 || current.length() >= 10) {
            System.out.print("Password must be between 6 and 10 characters\n");
            isCorrectSymbols = false;

        }
        for (int i = 0; i < current.length(); i++) {
            if (Character.isDigit(current.charAt(i))) {
                countDigits++;
            }
        }
        if (countDigits < 2) {
            System.out.print("Password must have at least 2 digits\n");
            isCorrectSymbols = false;
        }

        if (isCorrectSymbols == true) {
            System.out.print("Password is valid");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Password = sc.nextLine();
        CheckPassword((Password));

    }
}
