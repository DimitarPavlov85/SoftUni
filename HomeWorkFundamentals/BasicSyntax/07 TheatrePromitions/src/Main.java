import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner((System.in));
        String days=sc.nextLine();
        int age =Integer.parseInt(sc.nextLine());

               int price=-1;
        switch(days.toLowerCase()){
            case "weekday": {
                if (age <= 18 && age >= 0) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else if (age > 64 && age <= 122) {
                    price = 12;
                } else {
                    System.out.print("Error!");
                }
            }
            break;
            case "weekend": {
                if (age <= 18 && age >= 0) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else if (age > 64 && age <= 122) {
                    price = 15;
                } else {
                    System.out.print("Error!");
                }
            }
            break;
            case "holiday":{
                if (age <= 18 && age >= 0) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                } else {
                    System.out.print("Error!");
                }
            }
        }
        if(price!=-1){
            System.out.printf("%d%s",price,"$");

        }
    }
}
