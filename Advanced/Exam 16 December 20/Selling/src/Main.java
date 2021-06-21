import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<List<Character>> matrix = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            List<Character> current = new ArrayList<>();
            String line = sc.nextLine();
            for (int j = 0; j < number; j++) {
                current.add(line.toCharArray()[j]);
            }
            matrix.add(current);
        }
        Integer row = 0;
        Integer cow = 0;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) == 'S') {
                    row = i;
                    cow = j;
                    break;
                }
            }
        }
        int sum = 0;

        boolean isActive = false;
        while (isActive == false) {
            String comand = sc.nextLine();

            if (comand.equals("up")) {
                actions(matrix, row, cow, -1, 0, false, sum);
            }
            if (comand.equals("down")) {
                actions(matrix, row, cow, 1, 0, false, sum);
            }
            if (comand.equals("left")) {
                actions(matrix, row, cow, 0, -1, false, sum);
            }
            if (comand.equals("right")) {
                actions(matrix, row, cow, 0, 1, false, sum);
            }
        }
        System.out.println("Money: " + sum);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }

    }

    public static void actions(List<List<Character>> matrix, Integer row, Integer cow, int index, int index2, boolean isActive, int sum) {
        int newRow = row + index;
        int newCow = cow + index2;
        matrix.get(row).set(cow, '-');
        if (newCow > matrix.size() - 1) {
            System.out.println("Bad news, you are out of the bakery.");
            isActive = true;

        } else if (matrix.get(newRow).get(newCow) == 'O') {

            matrix.get(newRow).set(newCow, '-');
            for (int i = 0; i < matrix.size(); i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    if (matrix.get(i).get(j) == 'O') {
                        row = i;
                        cow = j;
                        matrix.get(row).set(cow, 'S');

                    }
                }
            }
        } else if (newCow < matrix.size() - 1) {

            if (Character.isDigit(matrix.get(newRow).get(newCow))) {
                int currentValue = Character.getNumericValue(matrix.get(newRow).get(newCow));
                sum += currentValue;
            }
            if (sum > 50) {
                isActive = true;
                System.out.println("Good news! You succeeded in collecting enough money!");

            }
            matrix.get(newRow).set(newCow, 'S');
            row = newRow;
            cow = newCow;

        }
    }
}


