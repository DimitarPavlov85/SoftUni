import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consumer<String>print=s-> System.out.println("Sir "+s);
        List<String> names = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());
        names.stream().forEach(print);
    }
}
