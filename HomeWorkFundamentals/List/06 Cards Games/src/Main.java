import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void CreateList(List<Integer>Current,Scanner sc){
    String Line=sc.nextLine();
    String[] LineOfDigits=Line.split(" ");
    for(int i=0;i<LineOfDigits.length;i++){
        Current.add(Integer.parseInt(LineOfDigits[i]));
    }
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Integer>FirstPlayer=new ArrayList<>();
        List<Integer>SecondPlayer=new ArrayList<>();
        CreateList(FirstPlayer,sc);
        CreateList(SecondPlayer,sc);
        while(!(FirstPlayer.isEmpty() || SecondPlayer.isEmpty())){
            int FirstCard=FirstPlayer.get(0);
            int SecondCard=SecondPlayer.get(0);
            FirstPlayer.remove(0);
            SecondPlayer.remove(0);

           if(FirstCard>SecondCard){
               FirstPlayer.add(FirstCard);FirstPlayer.add(SecondCard);
            }
            else if (FirstCard<SecondCard) {
               SecondPlayer.add(SecondCard);SecondPlayer.add(FirstCard);
            }
        }
            int Sum=0;
            if(FirstPlayer.size()!=0){
                for(int i=0;i<FirstPlayer.size();i++){
                    Sum+=FirstPlayer.get(i);
                }
                System.out.printf("First player wins! Sum: %d ",Sum);
            }
            else {
                for(int i=0;i<SecondPlayer.size();i++){
                    Sum+=SecondPlayer.get(i);
                }
                System.out.printf("Second player wins! Sum: %d ",Sum);
            }


    }
}
