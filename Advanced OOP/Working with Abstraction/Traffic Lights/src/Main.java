import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] signals = sc.nextLine().split(" ");
        List<Lights> lights = getLights(signals);

        int numberOfLights = Integer.parseInt(sc.nextLine());
        PrintNumberOfLightsActions(signals, lights, numberOfLights);

    }
    private static void PrintNumberOfLightsActions(String[] signals, List<Lights> lights, int numberOfLights) {
        for (int j = 0; j < numberOfLights; j++) {

            for (int i = 0; i < signals.length; i++) {
                int p = lights.get(i).index;
                p++;
                if (p > 2) {
                    lights.set(i, Lights.RED);
                    System.out.print(lights.get(i)+" ");
                }
                else if (p==1){
                    lights.set(i, Lights.GREEN);
                    System.out.print(lights.get(i)+" ");
                }
                else{
                    lights.set(i, Lights.YELLOW);
                    System.out.print(lights.get(i)+" ");
                }
            }
            System.out.println();
        }
    }

    private static List<Lights> getLights(String[] signals) {
        List<Lights> lights = new ArrayList<>();
        for (int i = 0; i < signals.length; i++) {
            if (signals[i].equals("RED")) {
                Lights l = Lights.RED;
                lights.add(l);
            } else if (signals[i].equals("GREEN")) {
                Lights l = Lights.GREEN;
                lights.add(l);
            }
            if (signals[i].equals("YELLOW")) {
                Lights l = Lights.YELLOW;
                lights.add(l);
            }
        }
        return lights;
    }
}
