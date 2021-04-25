import java.util.Scanner;
public class Main {
    /*
    * Write a program which creates 2 arrays. You will be given an integer n.
    *  On the next n lines, you get 2 integers. Form 2 arrays as shown below.
    * Input	      Output
    4
    1 5
    9 10
    31 81
    41 20
    *            1 10 31 20
                 5 9 81 41
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] line1 = new String[n];
        String[] line2 = new String[n];


        for (int i = 0; i < n; i++) {
            String[] CurrentArray;
            CurrentArray = sc.nextLine().split(" ");
            if (i % 2 == 0) {
                line2[i] = CurrentArray[1];
                line1[i] = CurrentArray[0];
            } else {
                line2[i] = CurrentArray[0];
                line1[i] = CurrentArray[1];
            }
        }
        for (int i = 0; i < line1.length; i++) {
            System.out.print(line1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < line2.length; i++) {
            System.out.print(line2[i] + " ");
        }
    }
}
