import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int NumberOfAdd =Integer.parseInt(sc.nextLine());
        int Capacity =0;
        for (int i=0;i<NumberOfAdd;i++){
            int Liters =Integer.parseInt(sc.nextLine());
            if (Capacity+Liters<=255){
                Capacity+=Liters;
            }
            else {
                System.out.print("Insufficient capacity!\n");
            }
        }
        System.out.print(Capacity);
    }
}
