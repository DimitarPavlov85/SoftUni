import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();
        LinkedHashSet<String >usernames=new LinkedHashSet<>();
        for(int i=0;i<number;i++){
            String currentName=sc.nextLine();
            usernames.add(currentName);
        }
        for (String w:usernames
             ) {
            System.out.println(w);
        }
    }
}
