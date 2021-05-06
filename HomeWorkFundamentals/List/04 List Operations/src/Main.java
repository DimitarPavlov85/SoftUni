import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void PrintList(List<Integer> Current) {
        for (int i = 0; i < Current.size(); i++) {
            System.out.print(Current.get(i) + " ");
        }
    }

    private static List<Integer> CreateList(Scanner sc) {
        List<Integer> Digits = new ArrayList<>();
        String line = sc.nextLine();
        String[] LineOfDigits = line.split(" ");
        for (int i = 0; i < LineOfDigits.length; i++) {
            Digits.add(Integer.parseInt(LineOfDigits[i]));
        }
        return Digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> Digitts = CreateList(sc);
        String CommandsAndValues = sc.nextLine();
        while (!CommandsAndValues.equals("End")) {
            String[] Commands = CommandsAndValues.split(" ");

            if (Commands[0].equals("Add")) {
                int DigitToAdd = Integer.parseInt(Commands[1]);
                Digitts.add(Digitts.size(), DigitToAdd);
            } else if (Commands[0].equals("Remove")) {
                int Index = Integer.parseInt(Commands[1]);
                if (Index > Digitts.size() - 1|| Index<0) {
                    System.out.print("Invalid index\n");
                } else {
                    Digitts.remove(Index);
                }
            } else if (Commands[0].equals("Insert")) {
                int Index = Integer.parseInt(Commands[2]);
                if (Index > Digitts.size() || Index<0) {
                    System.out.print("Invalid index");
                } else {
                    int Value = Integer.parseInt(Commands[1]);
                    Digitts.add(Index, Value);
                }
            }
            else if (Commands[0].equals("Shift")) {
                int Index = Integer.parseInt(Commands[2]);

                if (Index > Digitts.size()|| Index<0) {
                    System.out.print("Invalid index\n");
break;
                }
                else if (Commands[1].equals("left")) {
                    for (int i = 0; i < Index; i++) {
                        Digitts.add(Digitts.size(), Digitts.get(i));
                    }

                    while (0 < Index) {
                        Digitts.remove(0);
                        Index--;
                    }
                }
                else if (Commands[1].equals("right")) {
                    int StartIndex = Digitts.size() - Index;
                    for (int i = StartIndex; i < Digitts.size(); i++) {
                        int currentdigit = Digitts.get(i);
                        Digitts.remove(i);
                        Digitts.add(0, currentdigit);
                    }
                }
            }
            CommandsAndValues = sc.nextLine();
        }
        PrintList(Digitts);
        if(Digitts.size()==0){
            System.out.print(0);
        }
    }
}
