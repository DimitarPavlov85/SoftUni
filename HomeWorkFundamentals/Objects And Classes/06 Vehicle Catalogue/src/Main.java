import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Cars {
        String Type;
        String Kind;
        String Color;
        int Power;

        Cars(String _type, String _kind, String _color, int _power) {
            this.Type = _type;
            this.Kind = _kind;
            this.Color = _color;
            this.Power = _power;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cars> Cars = new ArrayList<>();
        String Line = sc.nextLine();
        while (!Line .equals("End")) {
            String[] DataOfCars = Line.split(" ");
            String CurrentType = DataOfCars[0];
            String FirstLetter=CurrentType.substring(0,1);
            FirstLetter=FirstLetter.toUpperCase();
            String AllLetters=CurrentType.substring(1,CurrentType.length());
            CurrentType=FirstLetter+AllLetters;
            String CurrentKind = DataOfCars[1];
            String CurrentColor = DataOfCars[2];
            int CurrentPower = Integer.parseInt(DataOfCars[3]);
            if(CurrentPower>0){
                Cars p = new Cars(CurrentType, CurrentKind, CurrentColor, CurrentPower);
                Cars.add(p);
            }
            Line = sc.nextLine();
        }
        String Reading=sc.nextLine();
        while(!Reading.equals("Close the Catalogue")){
            for(int i=0;i<Cars.size();i++){
                if(Cars.get(i).Kind.equals(Reading)){
                    System.out.printf("Type: %s\n",Cars.get(i).Type);
                    System.out.printf("Model: %s\n",Cars.get(i).Kind);
                    System.out.printf("Color: %s\n",Cars.get(i).Color);
                    System.out.printf("Horsepower: %s\n",Cars.get(i).Power);
                }
            }
                Reading=sc.nextLine();
        }
        float AverageCarsHorsePower=0;
        float AverageTracksHorsePower=0;
        int countTrucks=0;
        int countCars=0;
        for(int i=0;i<Cars.size();i++){
            if(Cars.get(i).Type.equals("Truck")){
                AverageTracksHorsePower+=Cars.get(i).Power;
                countTrucks++;

            }
            else {
                AverageCarsHorsePower+=Cars.get(i).Power;
                countCars++;

            }
        }
        System.out.printf("Cars have average horsepower of: %.2f%s\n",AverageCarsHorsePower/countCars,".");
        System.out.printf("Trucks have average horsepower of: %.2f%s",AverageTracksHorsePower/countTrucks,".");
    }
}
