import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Integer> CreateList(Scanner sc) {
        List<Integer> LineOfDigits = new ArrayList<>();
        String Line = sc.nextLine();
        String[] LineOfDigit = Line.split(" ");
        for (int i = 0; i < LineOfDigit.length; i++) {
            LineOfDigits.add(Integer.parseInt(LineOfDigit[i]));
        }
        return LineOfDigits;
    }

    public static void ConvertList(List<Integer> Line, int Index, int Damage) {
        int LeftDamage = Index - Damage;
        int RightDamage = Index + Damage;
        if (Index - Damage <= 0) {
            LeftDamage = 0;
        }
        if (Index + Damage >= Line.size()) {
            RightDamage = Line.size()-1;
            ;
        }
        while (LeftDamage <= RightDamage) {
            Line.remove(RightDamage);
            RightDamage--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> Line = CreateList(sc);
        int SpNumber = sc.nextInt();
        int Damage = sc.nextInt();
        int Index = 0;
        boolean Isequal = false;

        for (int i = 0; i < Line.size(); i++) {
            if (Line.get(i) == SpNumber) {
                Index=i;
                ConvertList(Line, Index, Damage);
            }
        }
        int Sum = 0;
        for (int i = 0; i < Line.size(); i++) {
            Sum += Line.get(i);
        }
        System.out.print(Sum);
    }
}