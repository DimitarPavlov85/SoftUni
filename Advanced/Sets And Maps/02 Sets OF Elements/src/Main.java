import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String [] sizeOfSets=sc.nextLine().split(" ");
        int sizeN=Integer.parseInt(sizeOfSets[0]);
        int sizeM=Integer.parseInt(sizeOfSets[1]);
        LinkedHashSet<String> n=new LinkedHashSet<>();
        LinkedHashSet<String>m=new LinkedHashSet<>();

        createSet(sc, sizeN, n);
        createSet(sc, sizeM, m);

        printUniqueElements(n, m);
    }

    private static void printUniqueElements(HashSet<String> n, HashSet<String> m) {
        for (String s: n) {
             if(m.contains(s)){
                 System.out.print(s+ " ");
             }
        }
    }

    private static void createSet(Scanner sc, int sizeN, HashSet<String> n) {
        for (int i = 0; i < sizeN; i++) {
            n.add(sc.nextLine());
        }
    }
}
