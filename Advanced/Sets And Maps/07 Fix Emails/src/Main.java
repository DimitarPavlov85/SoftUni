import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        LinkedHashMap<String, String>data=new LinkedHashMap<>();
        while(!line.equals("stop")){
              String email=sc.nextLine();

            fillMap(line, data, email);

            line=sc.nextLine();
        }
          printMap(data);
    }

    private static void fillMap(String line, LinkedHashMap<String, String> data, String email) {
        if(!email.contains(".us")&&!email.contains(".uk")&&!email.contains(".com"))
        {
            List<String>current=new ArrayList<>();
            current.add(email);
                    data.put(line, email);
        }
    }

    private static void printMap(LinkedHashMap<String, String> data) {
        for(Map.Entry s: data.entrySet()){
            System.out.print(s.getKey()+" -> ");
            System.out.printf("%s\n",s.getValue());


        }
    }
}
