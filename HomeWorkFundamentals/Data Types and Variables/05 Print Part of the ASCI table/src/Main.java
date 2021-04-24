import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Begin=Integer.parseInt(sc.nextLine());
        int End=Integer.parseInt(sc.nextLine());
        for (int i=Begin;i<=End;i++){
            System.out.printf("%s%s",(char)(i)," ");
        }
    }
}
