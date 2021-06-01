import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        TreeSet<String> elements=new TreeSet<>();
        for(int i=0;i<n;i++){
            String []lines =sc.nextLine().split(" ");
            for(int j=0;j< lines.length;j++){
                elements.add(lines[j]);
            }
        }

        for (String s:elements
             ) {
            System.out.print(s+" ");
        }
    }
}
