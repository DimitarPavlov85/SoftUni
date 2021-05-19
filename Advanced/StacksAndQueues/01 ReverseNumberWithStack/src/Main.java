import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []line;
        line = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for(int i=0;i<line.length;i++){
            stack.push(line[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
