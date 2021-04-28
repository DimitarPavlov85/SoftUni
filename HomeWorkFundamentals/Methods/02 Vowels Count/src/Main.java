import java.util.Scanner;
import java.lang.String;
public class Main {
    public static int Vowels(String Words) {
        int Count = 0;
        for (int i = 0; i < Words.length(); i++) {

            if (Words.toLowerCase().charAt(i) == 'a' || Words.toLowerCase().charAt(i) == 'e' ||
                Words.toLowerCase().charAt(i) == 'o' || Words.toLowerCase().charAt(i) == 'u' ||
                    Words.toLowerCase().charAt(i) == 'y'|| Words.toLowerCase().charAt(i) == 'i')
            {
                Count++;
            }

        }
        return Count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Words = sc.next();
        int VowelsCount = Vowels(Words);

        System.out.print(VowelsCount);
    }
}
