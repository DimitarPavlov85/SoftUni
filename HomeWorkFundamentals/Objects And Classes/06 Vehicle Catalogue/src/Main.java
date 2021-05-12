import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Cars {
        String type;
        String kind;
        String color;
        int power;

        Cars(String _type, String _kind, String _color, int _power) {
            this.type = _type;
            this.kind = _kind;
            this.color = _color;
            this.power = _power;
        }

        public String getType() {
            return type;
        }

        public String getKind() {
            return kind;
        }

        public String getColor() {
            return color;
        }

        public int getPower() {
            return power;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cars> cars = new ArrayList<>();
        String line = sc.nextLine();
        while (!line .equals("End")) {
            String[] dataOfCars = line.split(" ");
            String currentType = dataOfCars[0];
            String firstLetter=currentType.substring(0,1);
            firstLetter=firstLetter.toUpperCase();
            String allLetters=currentType.substring(1,CurrentType.length());
            currentType=firstLetter+allLetters;
            String currentKind = dataOfCars[1];
            String currentColor = dataOfCars[2];
            int currentPower = Integer.parseInt(DataOfCars[3]);
            if(currentPower>0){
                Cars p = new Cars(currentType, currentKind, currentColor, currentPower);
                Cars.add(p);
            }
            line = sc.nextLine();
        }
        String reading=sc.nextLine();
        while(!reading.equals("Close the Catalogue")){
            for(int i=0;i<Cars.size();i++){
                if(Cars.get(i).kind.equals(Reading)){
                    System.out.printf("Type: %s\n",Cars.get(i).type);
                    System.out.printf("Model: %s\n",Cars.get(i).kind);
                    System.out.printf("Color: %s\n",Cars.get(i).color);
                    System.out.printf("Horsepower: %s\n",Cars.get(i).power);
                }
            }
                reading=sc.nextLine();
        }
        float averageCarsHorsePower=0;
        float averageTracksHorsePower=0;
        int countTrucks=0;
        int countCars=0;
        for(int i=0;i<Cars.size();i++){
            if(Cars.get(i).Type.equals("Truck")){
                averageTracksHorsePower+=Cars.get(i).Power;
                countTrucks++;

            }
            else {
                averageCarsHorsePower+=Cars.get(i).Power;
                countCars++;

            }
        }
        System.out.printf("Cars have average horsepower of: %.2f%s\n",averageCarsHorsePower/countCars,".");
        System.out.printf("Trucks have average horsepower of: %.2f%s",averageTracksHorsePower/countTrucks,".");
    }
}
