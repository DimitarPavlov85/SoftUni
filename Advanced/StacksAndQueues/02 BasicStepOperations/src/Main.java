import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int numbers = Integer.parseInt(line[0]);
        int numbersByRemove = Integer.parseInt(line[1]);
        int isPresent = Integer.parseInt(line[2]);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbers; i++) {
            int currentDigit = sc.nextInt();
            stack.push(currentDigit);
        }
        while (numbersByRemove > 0) {
            stack.pop();
            numbersByRemove--;
        }
        boolean isSmalest = false;
        int minDigit = 0;
        if (stack.isEmpty()) {
            System.out.print(minDigit);
            isSmalest=true;
        }

        minDigit = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            if (minDigit > stack.peek()) {
                minDigit = stack.peek();
            }
            if (stack.peek() == isPresent) {
                System.out.print("true");
                isSmalest = true;
                break;
            } else {
                stack.pop();
            }
        }
        if (minDigit != 0 && isSmalest == false) {
            System.out.print(minDigit);
        }
    }
}
