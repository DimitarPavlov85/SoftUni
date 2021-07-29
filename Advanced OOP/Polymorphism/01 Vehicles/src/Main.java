import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] carData = sc.nextLine().split(" ");
        Vehicles car = new Car(Double.parseDouble(carData[1]), Double.parseDouble(carData[2]));

        String[] truckData = sc.nextLine().split(" ");
        Vehicles track = new Truck(Double.parseDouble(truckData[1]), Double.parseDouble(truckData[2]));

        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            String[] comands = sc.nextLine().split(" ");
            if (comands[0].equals("Drive")) {
                if (comands[1].equals("Car")) {
                    Drive(Double.parseDouble(comands[2]), car);
                }
                else{
                    Drive(Double.parseDouble(comands[2]), track);
                }
            }
            else {
                if (comands[1].equals("Car")) {
                    Refuel(Double.parseDouble(comands[2]), car);
                }
                else{
                    Refuel(Double.parseDouble(comands[2]), track);
                }
            }
        }
        System.out.printf("Car: %.2f\n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n",track.getFuelQuantity());

    }

    private static void Refuel(double newFuel, Vehicles type) {
        type.refueled(newFuel);
    }

    private static void Drive(double distance, Vehicles type) {
        type.canBeDrivenInDistance(distance);
    }

}
