import java.util.Scanner;

public class Main {
public static  void PrintCharecterInRange(char a,char b) {
    if (a < b) {
        for (char i = a; i < b; i++) {
            if (i != a) {
                System.out.print(i+" ");
            }

        }
    }
    else if (b<a){
        for (char i=b;i<a;i++){
            if(i!=b){
                System.out.print(i+" ");
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner((System.in));
        Character Begin =sc.nextLine().charAt(0);
        Character End =sc.nextLine().charAt(0);
        PrintCharecterInRange(Begin,End);
	    }
}
