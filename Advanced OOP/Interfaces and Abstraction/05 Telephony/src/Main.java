import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>call=new ArrayList<>();
        List<String>browse=new ArrayList<>();
        call= Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        browse= Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        Smartphone s=new Smartphone(call,browse);

        System.out.println(s.call());
        System.out.println(s.browse());
    }
}
