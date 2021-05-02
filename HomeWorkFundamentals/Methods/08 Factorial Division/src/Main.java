import java.util.Scanner;

public class Main {
public static long FactorielSum(long Digit){
    long Sum=Digit;
    while(Digit>2){
        Sum=Sum*(Digit-1);
        Digit--;
    }
    return Sum;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long FirstDigit=Integer.parseInt(sc.nextLine());
        long SecondDigit=Integer.parseInt(sc.nextLine());
        long FirstFactorielSum=FactorielSum(FirstDigit);
        long SecondFactorielSum=FactorielSum(SecondDigit);
        double DivisibleResult=FirstFactorielSum/SecondFactorielSum;
        System.out.printf("%.2f",DivisibleResult);
    }
}
