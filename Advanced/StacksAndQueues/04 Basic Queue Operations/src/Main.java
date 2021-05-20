import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        int [] line= Arrays.stream(sc.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int numbers=line[0];
        int numbersToBeRemove=line[1];
        int isPresent=line[2];
        for(int i=0;i<numbers;i++){
            int current=sc.nextInt();
            deque.offer(current);
        }
        while(numbersToBeRemove>0){
            deque.poll();
            numbersToBeRemove--;
        }
        boolean isEmpty=false;
        if(deque.isEmpty()){
            System.out.print(0);
            isEmpty=true;
        }
        int minDigit=Integer.MAX_VALUE;
        while(!deque.isEmpty()){
            if(minDigit>deque.peek()){
                minDigit=deque.peek();
            }
            if(deque.peek()==isPresent){
                System.out.print("true");
                isEmpty=true;
                break;
            }else {
                deque.pop();
            }

        }
        if(isEmpty==false){
            System.out.print(minDigit);
        }

    }
}
