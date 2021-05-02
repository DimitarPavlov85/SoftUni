import java.util.Scanner;

public class Main {
    public static void EvenString(String Word) {
        int MiddleSize = Word.length() / 2;

        System.out.print(Word.charAt(MiddleSize - 1));
        System.out.print(Word.charAt(MiddleSize));
    }
public static void OddString(String Word){
       int MiddleSize=Word.length()/2;
       System.out.print(Word.charAt(MiddleSize));
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();
        if (Word.length() % 2 == 0) {
            EvenString(Word);
        }
        else{
            OddString(Word);
        }
    }
}
