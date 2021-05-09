import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Integer>Digits=new ArrayList<>();
        String Line=sc.nextLine();
        String [] Arrays=Line.split("\\|");
        for(int i=0;i<Arrays.length;i++){

            String CurrentArray=Arrays[i] ;
            String[] NewArrays=CurrentArray.split("\\s+");

            for(int j=NewArrays.length-1;j>=0;j--){
                if(NewArrays[j].length()!=0){
                    Digits.add(0,Integer.parseInt(NewArrays[j]));
                }
            }
        }
        for(Integer i:Digits){
            System.out.print(i+ " ");
        }
    }
}
