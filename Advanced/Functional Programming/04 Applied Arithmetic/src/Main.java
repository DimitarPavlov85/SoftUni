import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>digit= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        String comand=sc.nextLine();
boolean isprint=false;
        while(!comand.equals("end")){
            if(comand.equals("add")){
                for (int i=0;i<digit.size();i++){
                    int current=digit.get(i);
                  digit.set(i,current+1);
                }
                isprint=false;
            }
            else if(comand.equals("multiply")){
                for (int i=0;i<digit.size();i++){
                    int current=digit.get(i);
                    digit.set(i,current*2);
                }
                isprint=false;
            }
            else if(comand.equals("subtract")){
                for (int i=0;i<digit.size();i++){
                    int current=digit.get(i);
                    digit.set(i,current-1);
                }
                isprint=false;
            }
            else if (comand.equals("print")){
                isprint=true;
                digit.forEach(e-> System.out.print(e+" "));
                System.out.println();
            }
            comand=sc.nextLine();
        }
        if(!isprint){
            digit.forEach(e-> System.out.print(e+" "));
        }
    }
}
