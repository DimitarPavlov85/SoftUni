
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        String name= cs.nextLine();
        int age =Integer.parseInt(cs.nextLine());
        double score =Double.parseDouble(cs.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,score);    }
}
