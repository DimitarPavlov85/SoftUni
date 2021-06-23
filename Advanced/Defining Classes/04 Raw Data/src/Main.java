import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        LinkedHashSet <Car> setFromCars = new LinkedHashSet<>();
        for (int i = 0; i < number; i++) {
            String[] line = sc.nextLine().split("\\s+");
            Car car;
            car = new Car(
                    line[0],
                    Integer.parseInt(line[1]),
                    Integer.parseInt(line[2]),
                    Integer.parseInt(line[3]),
                    line[4],
                    Double.parseDouble(line[5]),
                    Integer.parseInt(line[6]),
                    Double.parseDouble(line[7]),
                    Integer.parseInt(line[8]),
                    Double.parseDouble(line[9]),
                    Integer.parseInt(line[10]),
                    Double.parseDouble(line[11]),
                    Integer.parseInt(line[12]) );
            setFromCars.add(car);
        }

        String comand = sc.nextLine();
        Predicate<Car>isCorrect=e->e.cargo.getCargoType().equals("fragile")
                && e.tyre.getTyre1Pressure() <1
                || e.tyre.getTyre2Pressure() <1
                || e.tyre.getTyre3Pressure() <1
                || e.tyre.getTyre4Pressure() <1;

        if (comand.equals("fragile")) {
            setFromCars.stream().collect(Collectors.groupingBy(e->e.cargo.getCargoType().equals("fragile")&&e.tyre.getTyre1Pressure()<1));

        }
        else if (comand.equals("flamable")) {
            setFromCars.stream().filter(e->e.engine.getEnginePower()>250)
                                .forEach(s-> System.out.println(s.engine.getModel()));
        }
    }

}

