import javax.security.auth.callback.ChoiceCallback;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        short n=Short.parseShort(sc.nextLine());
        int ResultFromAdd=0;
        for(int i=0;i<n;i++){
            char CurrentSymbol= sc.nextLine().charAt(0);
            ResultFromAdd+=(int) CurrentSymbol;
        }
        System.out.printf("%s%d","The sum equals: ",ResultFromAdd);
    }
}
