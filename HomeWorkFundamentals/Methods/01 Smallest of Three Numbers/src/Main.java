import java.util.Scanner;

public class Main {
    public static int GetMin(int first,int second){
        if(first<second){
            return first;
        }
        else {
            return second;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int FirstDigit=Integer.parseInt(sc.nextLine());
        int SecondDigit=Integer.parseInt(sc.nextLine());
        int ThreeDigit=Integer.parseInt(sc.nextLine());
        System.out.print(GetMin(GetMin(FirstDigit,SecondDigit),ThreeDigit));
    }
}
