import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        ArrayDeque<Integer> digits = new ArrayDeque<>();
        while (number > 0) {
            String[] comands = sc.nextLine().split(" ");

            int currentValue;
            if (comands.length == 2 && comands[0].equals("1")) {
                currentValue = Integer.parseInt(comands[1]);
                digits.push(currentValue);
            } else if (comands[0].equals("2")) {
                digits.pop();
            }
            else if(comands[0].equals("3")){
                System.out.println(Collections.max(digits));
            }
            number--;
        }

    }

}
