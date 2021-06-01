import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] line=sc.nextLine().split("-");
        Map<String,String>phonebook=new LinkedHashMap<>();
        while(!line[0].equals("search")){
            phonebook.put(line[0],line[1]);
            line=sc.nextLine().split("-");
        }
        String nameOfSearch=sc.nextLine();
        while(!nameOfSearch.equals("stop")){
            if(phonebook.containsKey(nameOfSearch)){
             String value=phonebook.get(nameOfSearch);

                System.out.println(nameOfSearch +" -> "+value);
            }
            else {
               System.out.println("Contact "+nameOfSearch+" does not exist.");
            }
            nameOfSearch=sc.nextLine();
        }

    }
}
