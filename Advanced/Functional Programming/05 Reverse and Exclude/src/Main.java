import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>digits= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        int number=sc.nextInt();
       Predicate<Integer> isdivide=isfilter(number);
        Collections.reverse(digits);
        digits.stream().filter(isdivide).forEach(e-> System.out.print(e+" "));
    }
    public static  Predicate<Integer>isfilter(Integer number){
        return s->s%number!=0;
        }

}
