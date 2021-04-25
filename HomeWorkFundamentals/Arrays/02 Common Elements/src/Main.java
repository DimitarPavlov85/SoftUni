import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ArrayOne = sc.nextLine().split(" ");
        String[] ArrayTwo = sc.nextLine().split(" ");
        String[] ResultFromArrays = new String [ArrayOne.length];

        for (int i = 0; i < ArrayOne.length; i++) {

            for(int j=0;j<ArrayTwo.length;j++){
                if (ArrayOne[i].equals(ArrayTwo[j])) {
                    System.out.print(ArrayTwo[j]+" ");
                }
            }
        }
    }
}
