import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));

        String namecountry=sc.next();

        if( namecountry.equals("USA")  || namecountry.equals("England")){
            System.out.print("English");
        }
        else if(namecountry.equals("Spain")||namecountry.equals("Argentina")||namecountry.equals("Mexico")){
            System.out.print("Spanish");
        }
        else {
            System.out.print("unknown");
        }
    }
}