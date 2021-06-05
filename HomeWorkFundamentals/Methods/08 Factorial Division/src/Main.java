import java.util.Scanner;

public class Main {
public static long factorielSum(long digit){
    long Sum=digit;
    while(digit>2){
        Sum=Sum*(digit-1);
        digit--;
    }
    return Sum;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long firstDigit=Integer.parseInt(sc.nextLine());
        long secondDigit=Integer.parseInt(sc.nextLine());
        long firstFactorielSum=FactorielSum(firstDigit);
        long secondFactorielSum=FactorielSum(secondDigit);
        double divisibleResult=firstFactorielSum/secondFactorielSum;
        System.out.printf("%.2f",divisibleResult);
    }
}
