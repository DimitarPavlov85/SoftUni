import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String LineOfStrings = sc.nextLine();
        String[] ArrayOfDigits = LineOfStrings.split(" ");
        int[] ArrayOfIntegers = new int[ArrayOfDigits.length];
        for (int i = 0; i < ArrayOfIntegers.length; i++) {
            ArrayOfIntegers[i] = Integer.parseInt(ArrayOfDigits[i]);
        }

        int IndexResult = 1;
        int CurrentRightIndex = 2;
        if (ArrayOfIntegers.length == 1) {
            System.out.print(0);
        }
        else if (ArrayOfIntegers.length == 2) {
            System.out.print("no");
        }
        else {
            boolean IsEqualSum=false;
            for (int i = 0; i < ArrayOfIntegers.length; i++) {
                int LeftSum = 0;
                int RightSum = 0;
                for (int k = CurrentRightIndex; k < ArrayOfIntegers.length; k++) {
                    RightSum += ArrayOfIntegers[k];
                }
                for (int z = 0; z < IndexResult; z++) {
                    LeftSum += ArrayOfIntegers[z];
                }
                if (RightSum == LeftSum) {
                    System.out.print(IndexResult);
                    IsEqualSum=true;
                    break;
                } else {
                    IndexResult++;

                    CurrentRightIndex++;
                }
            }
            if (IsEqualSum==false){
                System.out.print("no");
            }

        }

    }
}
