import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char[] line=sc.nextLine().toCharArray();
        Map<Character,Integer>list= new TreeMap<>();

        for(int i=0;i<line.length;i++){
            Integer current=list.get(line[i]);
            if(current==null){
                list.put(line[i],1);
            }else {
                list.put(line[i],list.get(line[i])+1);
            }

        }
        for(Map.Entry<Character,Integer> f:list.entrySet()){
            System.out.printf("%c: %d time/s\n",f.getKey(),f.getValue());
        }
    }
}
