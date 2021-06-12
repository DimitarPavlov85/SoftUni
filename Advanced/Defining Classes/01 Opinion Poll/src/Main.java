
import javafx.print.Collation;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<People> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] data = sc.nextLine().split(" ");
            String currentName = data[0];
            int currentAge = Integer.parseInt(data[1]);
            if (currentAge > 30) {
                People current = new People(currentName, currentAge);
                list.add(current);
            }
        }
        Comparator<People> isCompare = (a, b) -> {
            return a.getName().compareTo(b.getName());
        };

        list.sort(isCompare);
        //  Collections.sort(list,Comparator.comparing(People::getName));
        list.forEach(e -> System.out.println(e.getName() + " - " + e.getAge()));

    }
}
