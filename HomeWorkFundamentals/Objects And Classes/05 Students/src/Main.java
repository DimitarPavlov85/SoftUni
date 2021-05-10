import java.util.*;

public class Main {
    public static class Students {
        String FirstName;
        String LastName;
        float Score;

        Students(String _firstname, String _secondname, float _score) {
            this.FirstName = _firstname;
            this.LastName = _secondname;
            this.Score = _score;
        }

        String GetFirstName() {
            return this.FirstName;
        }

        String GetLastName() {
            return this.LastName;
        }

        float GetScore() {
            return this.Score;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        List<Students>Data=new ArrayList<>();
        for(int i=0;i<Number;i++){
            String Line = scanner.nextLine();
            String [] DataForStudents=Line.split(" ");
            String CurrentFurstName=DataForStudents[0];
            String CurrentLastName=DataForStudents[1];
            float CurrentStudentsScore=Float.parseFloat(DataForStudents[2]);
            Students st=new Students(CurrentFurstName,CurrentLastName,CurrentStudentsScore);
            Data.add(st);
        }
        Collections.sort(Data, Comparator.comparing(Students::GetScore));
        Collections.reverse(Data);
        for(int i=0;i<Data.size();i++){
            System.out.printf( "%s %s: %.2f\n",Data.get((i)).GetFirstName(),Data.get(i).GetLastName(),Data.get(i).GetScore());
        }
    }
}
