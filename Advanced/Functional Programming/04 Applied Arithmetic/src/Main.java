import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> collect = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        String comand = sc.nextLine();
        boolean isprint = false;
        Function<List<Integer>, List<Integer>> add =
                         arr-> arr.stream()
                        .map(e -> e += 1)
                        .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiplay =
                         arr -> arr.stream()
                        .map(e -> e =e*=2)
                        .collect(Collectors.toList());
        Function<List<Integer>,List<Integer>>subtract=arr->arr.stream()
                                                    . mapToInt(e->e-=1)
                                                    .boxed()
                                                    .collect(Collectors.toList());
        while (!comand.equals("end")) {
            if (comand.equals("add")) {
             collect= add.apply(collect);
                isprint = false;
            } else if (comand.equals("multiply")) {
              collect= multiplay.apply(collect);
                isprint = false;
            } else if (comand.equals("subtract")) {
             collect=subtract.apply(collect);
                isprint = false;
            } else if (comand.equals("print")) {
                isprint = true;
                collect.forEach(s -> System.out.print(s + " "));
                System.out.println();
            }
            comand = sc.nextLine();
        }
        if (!isprint) {
            collect.forEach(e -> System.out.print(e + " "));
        }
    }
}
