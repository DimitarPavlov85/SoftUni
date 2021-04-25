import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int CountOfWagons=Integer.parseInt(sc.nextLine());
        int SumOfPasenger=0;
        int[] ArrayOfWagons=new int[CountOfWagons];

        for(int i=0;i<ArrayOfWagons.length;i++){
            int current=Integer.parseInt(sc.next());
            SumOfPasenger+=current;
            ArrayOfWagons[i]=current;
        }
        for(int i=0;i<ArrayOfWagons.length;i++){
            System.out.print(ArrayOfWagons[i]+" ");
        }
        System.out.println();
        System.out.print(SumOfPasenger);
    }
}
