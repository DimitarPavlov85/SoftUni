import java.util.Scanner;

public class Main {
    public static boolean IsPolindrom(String Line) {
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) != Line.charAt(Line.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();
        while (!Line.equals("END")) {
            System.out.println(IsPolindrom(Line));
            Line = sc.nextLine();
        }
    }
}
