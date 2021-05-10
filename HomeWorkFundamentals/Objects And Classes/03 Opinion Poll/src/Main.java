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
        List<Person> Persons=new ArrayList<>();

        int Number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Number; i++) {
            String nextLine = sc.nextLine();
            String[] LineOfData = nextLine.split(" ");
            String Name=LineOfData[0];
            int Age=Integer.parseInt(LineOfData[1]);
            if(Age>30){
                Person CurrentPerson=new Person(Name,Age);
                Persons.add(CurrentPerson);
            }

        }

        Collections.sort(Persons,Comparator.comparing(Person::GetName));
        for(int i=0;i<Persons.size();i++){
            System.out.printf("%s%s%s\n",Persons.get(i).GetName(), " - ",Persons.get(i).GetAge());
        }
    }
}
