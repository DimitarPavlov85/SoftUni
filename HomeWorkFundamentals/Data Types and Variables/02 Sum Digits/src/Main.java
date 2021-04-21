import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int Adddigits=0;

        while(number>0){
            int currentvalue=number%10;
          Adddigits += currentvalue;
          number/=10;
        }
        System.out.print(Adddigits);
    }
}
