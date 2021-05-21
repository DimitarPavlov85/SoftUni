import java.util.*;

public class Main {
    public static class Person  {
        private String name;
        private int age;

        Person(String _name, int _age) {
            this.name = _name;
            this.age = _age;
        }

        public String GetName() {
            return this.name;
        }

        public int GetAge() {
            return this.age;
        }
        public int CompareTo   ( Person a,Person b) {

         return   a.GetName().compareTo(a.GetName());

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons=new ArrayList<>();

        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            String nextLine = sc.nextLine();
            String[] lineOfData = nextLine.split(" ");
            String name=lineOfData[0];
            int age=Integer.parseInt(lineOfData[1]);
            if(age>30){
                Person currentPerson=new Person(name,age);
                Persons.add(currentPerson);
            }

        }

        Collections.sort(Persons,Comparator.comparing(Person::GetName));
        for(int i=0;i<Persons.size();i++){
            System.out.printf("%s%s%s\n",Persons.get(i).GetName(), " - ",Persons.get(i).GetAge());
        }
    }
}
