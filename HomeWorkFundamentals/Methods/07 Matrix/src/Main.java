import java.util.Scanner;

public class Main {
    public static void PrintMatrix(int Size) {
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                System.out.printf("%d%s",Size," ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        PrintMatrix(Size);
    }
}
