import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = Integer.parseInt(sc.nextLine());
        List<Integer> digit = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> Divisible = IntStream.rangeClosed(1, range)
                .boxed()
                .collect(Collectors.toList());
        BiPredicate<Integer, Integer> isDivisible = (a, b) -> a % b == 0;
        for (Integer s : Divisible) {
            boolean currentDivisible=false;
            for (Integer d : digit) {
              currentDivisible=  isDivisible.test(s, d);
            }
            if(currentDivisible==true){
                System.out.print(s+" ");
            }
        }
    }
}