import java.util.*;

public class Main {
    public static class Students {
        String firstName;
        String lastName;
        float score;

        Students(String _firstname, String _secondname, float _score) {
            this.firstName = _firstname;
            this.lastName = _secondname;
            this.score = _score;
        }

        String GetFirstName() {
            return this.firstName;
        }

        String GetLastName() {
            return this.lastName;
        }

        float GetScore() {
            return this.score;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Students>data=new ArrayList<>();
        for(int i=0;i<number;i++){
            String line = scanner.nextLine();
            String [] dataForStudents=line.split(" ");
            String currentFurstName=dataForStudents[0];
            String currentLastName=dataForStudents[1];
            float currentStudentsScore=Float.parseFloat(dataForStudents[2]);
            Students st=new Students(currentFurstName,currentLastName,currentStudentsScore);
            data.add(st);
        }
        Collections.sort(data, Comparator.comparing(Students::GetScore));
        Collections.reverse(data);
        for(int i=0;i<data.size();i++){
            System.out.printf( "%s %s: %.2f\n",data.get((i)).GetFirstName(),data.get(i).GetLastName(),data.get(i).GetScore());
        }
    }
}
