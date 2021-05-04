import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = new ArrayList<>();
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        for (int i = 0; i < lines.length; i++) {
            wagons.add(Integer.parseInt(lines[i]));
        }

        int capacyti = Integer.parseInt(sc.nextLine());

        String key = sc.nextLine();

        while (!key.equals("end")) {
            String[] commandinput = key.split((" "));
            if (commandinput[0].equals("Add")) {
                int newWagon = Integer.parseInt(commandinput[1]);
                wagons.add(newWagon);
            } else if (!commandinput[0].equals("Add")) {
                int passenger = Integer.parseInt(commandinput[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (capacyti >= wagons.get(i) + passenger) {
                        wagons.set(i, wagons.get(i) + passenger);
                        break;
                    }
                }

            }

            key = sc.nextLine();
        }
        for (Integer f = 0; f < wagons.size(); f++) {
            System.out.print(wagons.get(f));
            if (f != wagons.size() - 1) {
                System.out.print(" ");
            }

        }

    }
}