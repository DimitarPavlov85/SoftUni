import java.util.ArrayDeque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(", ");

        ArrayDeque<Integer> effects = new ArrayDeque<>();
        ArrayDeque<Integer> cassing = new ArrayDeque<>();

        CreateStack(line, effects);
        line = sc.nextLine().split(", ");
        CreateDeque(line, cassing);
        Map<String, Integer> bombs = new TreeMap<>();

        bombs.put("Datura Bombs", 0);
        bombs.put("Cherry Bombs", 0);
        bombs.put("Smoke Decoy Bombs", 0);
        boolean isFull = false;
        while (!effects.isEmpty() && !cassing.isEmpty()) {
            if (bombs.get("Datura Bombs") >= 3 && bombs.get("Cherry Bombs") >= 3 && bombs.get("Smoke Decoy Bombs") >= 3) {
                isFull = true;
                break;
            }
            int currentEfects = effects.peek();
            int currentCassing = cassing.pop();
            int sum = currentCassing + currentEfects;
            if (sum == 40) {
                bombs.put("Datura Bombs", bombs.get("Datura Bombs") + 1);
                effects.pop();
            } else if (sum == 60) {
                bombs.put("Cherry Bombs", bombs.get("Cherry Bombs") + 1);
                effects.pop();

            } else if (sum == 120) {
                bombs.put("Smoke Decoy Bombs", bombs.get("Smoke Decoy Bombs") + 1);
                effects.pop();

            } else {
                cassing.push(currentCassing - 5);
            }
        }
        printStackDequeAndMap(effects, cassing, bombs, isFull);
    }

    private static void printStackDequeAndMap(ArrayDeque<Integer> effects, ArrayDeque<Integer> cassing, Map<String, Integer> bombs, boolean isFull) {
        if (isFull == true) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        System.out.print("Bomb Effects: ");
        if (!effects.isEmpty()) {

            String result = effects.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println(result);
        } else {
            System.out.println("empty");
        }
        System.out.print("Bomb Casings: ");
        if (!cassing.isEmpty()) {

            String result = cassing.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println(result);
        } else {
            System.out.println("empty");
        }
        for (Map.Entry<String, Integer> f : bombs.entrySet()) {
            System.out.printf("%s: %d\n", f.getKey(), f.getValue());
        }
    }

    private static void CreateDeque(String[] line, ArrayDeque<Integer> cassing) {
        for (int i = 0; i < line.length; i++) {
            cassing.push(Integer.parseInt(line[i]));
        }
    }

    private static void CreateStack(String[] line, ArrayDeque<Integer> effects) {
        for (int i = 0; i < line.length; i++) {
            effects.offer(Integer.parseInt(line[i]));
        }
    }
}
