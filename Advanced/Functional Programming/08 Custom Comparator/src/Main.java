import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> digits = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        Comparator<Integer> iscompare = (a, b) -> {

            if (a < b && a % 2 == 0 && b % 2 == 0) {
                return -1;
            } else if (a > b && a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a < b && a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a < b && a % 2 != 0 && b % 2 != 0) {
                return -1;
            } else if (a > b && a % 2 != 0 && b % 2 != 0) {
                return 1;
            }

            return 0;
        };
        digits.sort(iscompare);

        digits.forEach(e -> System.out.print(e + " "));

    }

    public static int isCompare(int a, int b) {

        if (a < b && a % 2 == 0 && b % 2 == 0) {
            return -1;
        } else if (a > b && a % 2 == 0 && b % 2 != 0) {
            return -1;
        } else if (a < b && a % 2 == 0 && b % 2 != 0) {
            return -1;
        } else if (a < b && a % 2 != 0 && b % 2 != 0) {
            return -1;
        } else if (a > b && a % 2 != 0 && b % 2 != 0) {
            return 1;
        }

        return 0;
    }
}
