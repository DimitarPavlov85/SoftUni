package SoftUni.Fundamentals.Passed;

import java.util.Scanner;

public class PassedMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float grade=Float.parseFloat(sc.nextLine());
        if(grade>=3.00){
            System.out.print("Passed!");
        }
    }
}
