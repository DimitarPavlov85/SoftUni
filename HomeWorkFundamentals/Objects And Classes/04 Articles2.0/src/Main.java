
import java.util.*;

public class Main {
    public static class Person {
        private String Title;
        private String Content;
        private String Author;

        Person(String _title, String _content, String _author) {
            this.Title = _title;
            this.Content = _content;
            this.Author = _author;
        }
        public String GetTitle() {
            return this.Title;
        }
        public String GetContent() {
            return this.Content;
        }
        public String GetAuthor() {
            return this.Author;
        }
    }
public static void PrintList(List<Person>Current){
        for(int i=0;i<Current.size();i++){
            System.out.print(Current.get(i).GetTitle()+ " -"+Current.get(i).GetContent()+ ":"+Current.get(i).GetAuthor()+"\n");
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = Integer.parseInt(sc.nextLine());
        List<Person> Person=new ArrayList<>();
        for (int i = 0; i < Number; i++) {
            String Line=sc.nextLine();
            String []LineofData=Line.split(",");
            Person p=new Person(LineofData[0],LineofData[1],LineofData[2]);
            Person.add(p);
        }
        String SortBy=sc.nextLine();
        if(SortBy.equals("title")){
            Collections.sort(Person, Comparator.comparing(Main.Person::GetTitle));
PrintList(Person);
        }
        else if(SortBy.equals("author")){
            Collections.sort(Person,Comparator.comparing(Main.Person::GetAuthor));
            PrintList(Person);
        }
        else if(SortBy.equals("content")){
            Collections.sort(Person,Comparator.comparing(Main.Person::GetContent));
            PrintList(Person);
        }
    }
}
