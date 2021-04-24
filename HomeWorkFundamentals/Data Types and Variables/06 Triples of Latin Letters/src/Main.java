import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Number =sc.nextInt();
        for (char i='a';i<'a'+Number;i++){
            for(char j='a';j<'a'+Number;j++){
                for (char k='a';k<'a'+Number;k++){
                    System.out.printf("%c%c%c\n",i,j,k);
                }
            }
        }
    }
}
