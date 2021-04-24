import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumberOgKegs = Integer.parseInt(sc.nextLine());
        String Kegname="";
        long Capacitykeg=0;
        for (int i = 0; i < NumberOgKegs; i++) {
            String CurrentNameOfKegs = sc.nextLine();
            float Radius = Float.parseFloat(sc.nextLine());
            long Height = Long.parseLong(sc.nextLine());
            long CurrentCapacitykeg= (long) (3.14 * Radius * Radius * Height);
            if (i == 0) {
                Kegname = CurrentNameOfKegs;

                Capacitykeg =CurrentCapacitykeg;
            }
            else {
                if(Capacitykeg<CurrentCapacitykeg){
                    Capacitykeg=CurrentCapacitykeg;
                    Kegname=CurrentNameOfKegs;
                }
            }
        }
        System.out.print(Kegname);
    }
}
