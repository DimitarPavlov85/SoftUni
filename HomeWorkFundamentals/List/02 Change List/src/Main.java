import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void PrintList(List<Integer>Current){
    for(int CurrentDigit:Current){
        System.out.print(CurrentDigit+" ");
    }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Line=sc.nextLine();
        String [] LinesOfDigits =Line.split(" ");
       List<Integer>Digits= CreateListOfDigits(LinesOfDigits);
       String CommandsLine=sc.nextLine();

       while (!CommandsLine.equals("end")){
           String [] Command=CommandsLine.split(" ");
           if(Command[0].equals("Insert")){
               int ValueOfAdd=Integer.parseInt(Command[1]);
               int IndexOfAdd=Integer.parseInt(Command[2]);
               Digits.add(IndexOfAdd,ValueOfAdd);
           }
           else if(Command[0].equals("Delete")){
               int DigitOfDelete=Integer.parseInt(Command[1]);
               for(int i=0;i<Digits.size();i++){
                   if(Digits.get(i)==DigitOfDelete){
                       Digits.remove(i);
                       i--;
                   }
               }
           }
           CommandsLine=sc.nextLine();
       }
       PrintList(Digits);
    }

    private static List<Integer> CreateListOfDigits(String[] linesOfDigits) {
        List<Integer> Digits= new ArrayList<Integer>();
        for(int i=0;i<linesOfDigits.length;i++){
            Digits.add(Integer.parseInt(linesOfDigits[i]));
        }
        return Digits;
    }
}
