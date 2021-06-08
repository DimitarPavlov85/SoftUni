import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer>digits= Arrays.stream(sc.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .boxed()
                             .collect(Collectors.toList());
        Function<List<Integer>,Integer>getMin=e->Collections.min(e);
        System.out.println(getMin.apply(digits));
    }
}
