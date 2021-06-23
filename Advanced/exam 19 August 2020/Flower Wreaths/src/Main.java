import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String []line1=sc.nextLine().split(", ");
        ArrayDeque<Integer> lilies=new ArrayDeque<>();
        for(int i=0;i< line1.length;i++){
            lilies.push((Integer.parseInt(line1[i])));
        }
         line1=sc.nextLine().split(", ");
        ArrayDeque<Integer> roses=new ArrayDeque<>();
        for(int i=0;i< line1.length;i++){
            roses.offer((Integer.parseInt(line1[i])));
        }

        int resultWreath=0;
        int sumOfFlowers=0;
        while(!roses.isEmpty()&&!lilies.isEmpty()){
            int currentLilies=lilies.pop();
            int currentRoses=roses.pop();
            int current=currentLilies+currentRoses;
            if(current==15){
                resultWreath+=1;
            }
            else if(current<15){
                sumOfFlowers+=current;
                if(sumOfFlowers>=15){
                    resultWreath++;
                    sumOfFlowers-=15;
                }
            }
            else if(current>15){
               while(current>=15){
                   current=current-2;
                   if(current==15){
                       resultWreath++;
                       break;
                   }
                   else if(current<15) {
                       sumOfFlowers+=current;
                       if(sumOfFlowers>=15){
                           resultWreath++;
                           sumOfFlowers-=15;
                       }
                       break;
                   }

               }
            }
        }

        if(resultWreath<5){
            System.out.println("You didn't make it, you need "+(5-resultWreath)+ " wreaths more!");
        }
        else{
            System.out.println("You made it, you are going to the competition with "+resultWreath+" wreaths!" );
        }
    }
}
