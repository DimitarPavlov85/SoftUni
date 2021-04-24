import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Number =sc.nextInt();
        for (int i=97;i<97+Number;i++){
            for(int j=97;j<97+Number;j++){
                for (int k=97;k<97+Number;k++){
                    System.out.printf("%c%c%c\n",(char)i,(char)j,(char)k);
                }
            }
        }
    }
}
