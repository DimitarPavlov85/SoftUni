import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Function<Stream<String>,List<Integer>>createList=e->e.mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        List<Integer>digits= createList.apply(Arrays.stream(sc.nextLine().split("\\s+")));
        int minDigit= Collections.min(digits);

          System.out.println(digits.lastIndexOf(minDigit));

    }
}
