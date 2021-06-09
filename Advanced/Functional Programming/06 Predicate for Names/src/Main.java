import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nameLength=Integer.parseInt(sc.nextLine());
        String [] names=sc.nextLine().split(" ");
        Predicate<String>isInRange=e->e.length()<=nameLength;
        Arrays.stream(names).filter(isInRange).forEach(System.out::println);
    }
}
