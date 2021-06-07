import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Consumer<String>print=str->System.out.println(str);
        String[] names= sc.nextLine().split("\\s+");
        for(int i=0;i<names.length;i++){
            print.accept(names[i]);
        }
    }
}
