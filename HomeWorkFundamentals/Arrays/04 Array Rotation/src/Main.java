import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String LineOfDigits = sc.nextLine();
        String[] ArrayOfStrings = LineOfDigits.split(" ");
        int[] ArrayOfDigits = new int[ArrayOfStrings.length];
        for (int i = 0; i < ArrayOfDigits.length; i++) {
            ArrayOfDigits[i] = Integer.parseInt(ArrayOfStrings[i]);
        }
        int IndexOfRotation = sc.nextInt();
        if (IndexOfRotation < ArrayOfDigits.length) {
            for (int i = IndexOfRotation; i < ArrayOfDigits.length; i++) {
                System.out.printf("%d%s", ArrayOfDigits[i], " ");
            }
            for (int i = 0; i < IndexOfRotation; i++) {
                System.out.printf("%d%s", ArrayOfDigits[i], " ");
            }

        } else if (IndexOfRotation >= ArrayOfDigits.length) {
            int CurrentIndexOfRotation = IndexOfRotation % ArrayOfDigits.length;

           for(int i=CurrentIndexOfRotation;i<ArrayOfDigits.length;i++){
               System.out.printf("%d%s",ArrayOfDigits[i]," ");
           }
           for(int i=0;i<CurrentIndexOfRotation;i++){
               System.out.printf("%d%s",ArrayOfDigits[i]," ");
           }
        }
    }
}
