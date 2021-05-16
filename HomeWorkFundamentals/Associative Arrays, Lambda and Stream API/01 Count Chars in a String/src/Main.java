import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] line=sc.nextLine().split(" ");
        HashMap<Character,Integer> countChars=new LinkedHashMap<>();

        for(int i=0;i<line.length;i++){
            char current;
            for(int j = 0; j<line[i].length(); j++){
                current = line[i].charAt(j);
            Integer count=countChars.get(current);
            if(count==(null)){
                 countChars.put(current, 1);
            }
            else {
                int digit= countChars.get(current);
                countChars.put(current,digit+1);
            }
        }}
         for(Map.Entry current : countChars.entrySet() ){
             System.out.println(current.getKey()+" -> "+current.getValue());
        }
    }
}
