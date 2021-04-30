import java.util.Scanner;

public class Main {
public static int ResultAfterAddAndSubstract(int First,int Second,int Thurth){
    int Result=(First+Second)-Thurth;
    return Result;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDigit = Integer.parseInt(sc.nextLine());
        int secondDigit = Integer.parseInt(sc.nextLine());
        int ThurdDigit = Integer.parseInt(sc.nextLine());
        int ResultFormThreeDigit=ResultAfterAddAndSubstract(firstDigit,secondDigit,ThurdDigit);
        System.out.print(ResultFormThreeDigit);
    }
}
