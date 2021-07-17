import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());


       try{
           Chicken ch=new Chicken(name,age);
           System.out.println(ch.toString());
       }
       catch (IllegalArgumentException ex){
           System.out.println(ex.getMessage());
       }





    }

}
