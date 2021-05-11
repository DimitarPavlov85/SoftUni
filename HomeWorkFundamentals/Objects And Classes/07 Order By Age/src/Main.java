import java.util.*;

public class Main {
public  static class Persons{
    private String name;
    private String ID;
    private int age;

    public String getName() {
        return name;
    }
    public Persons(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []Line=sc.nextLine().split(" ");
        List<Persons>person=new ArrayList<>();
        while(!Line[0].equals("End")){
            int age=Integer.parseInt(Line[2]);
            if(age>0){
              Persons  p=new  Persons(Line[0],Line[1],age);
              person.add(p);
            }
            Line=sc.nextLine().split(" ");
        }
        Collections.sort(person, Comparator.comparing(Persons::getAge));
        for (Persons persons : person) {
            System.out.printf("%s with ID: %s is %d years old.\n",persons.getName(), persons.getID(),persons.getAge());
        }


    }
}
