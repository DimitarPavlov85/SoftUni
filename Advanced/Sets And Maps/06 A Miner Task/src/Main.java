import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        LinkedHashMap<String,Integer>resources=new LinkedHashMap<>();
        while(!line.equals("stop")){
            String quantity=sc.nextLine();

            fillMap(line, resources, quantity);

            line=sc.nextLine();
        }
        printMap(resources);
    }

    private static void fillMap(String line, LinkedHashMap<String, Integer> resources, String quantity) {
        Integer currentValue= resources.get(line);
        if(currentValue==null){
            resources.put(line,Integer.parseInt(quantity));
        }
        else {
            resources.put(line, resources.get(line)+Integer.parseInt(quantity));
        }
    }

    private static void printMap(LinkedHashMap<String, Integer> resources) {
        for (Map.Entry s: resources.entrySet()) {
            System.out.println(s.getKey()+" -> "+s.getValue());
        }
    }
}
