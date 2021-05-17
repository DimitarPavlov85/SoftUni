import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        HashMap<String, Integer> pairOfMinerals = new LinkedHashMap<>();
        int count = 0;
        List<String> list=new ArrayList<>();
        while(!line.equals("stop")){
            list.add(line);
            line = sc.nextLine();
        }
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                Integer checkIsAvilable=pairOfMinerals.get(list.get(i));
                if(checkIsAvilable==null){
                    pairOfMinerals.put(list.get(i), 0);
                }
            }
            else {
                pairOfMinerals.put(list.get(i - 1), pairOfMinerals.get(list.get(i - 1)) + Integer.parseInt(list.get(i)));
            }
        }
        for (Map.Entry<String,Integer> current:pairOfMinerals.entrySet())
        {
            System.out.println(current.getKey()+" -> "+current.getValue());
        }
    }
}
