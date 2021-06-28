import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(", ");
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        for (int i = 0; i < line.length; i++) {
            tasks.push(Integer.parseInt(line[i]));
        }
        ArrayDeque<Integer> thread = new ArrayDeque<>();
        line = sc.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            thread.offer(Integer.parseInt(line[i]));
        }
        int value = Integer.parseInt(sc.nextLine());
        while (!tasks.isEmpty() && !thread.isEmpty()) {
            int currentTask = tasks.peek();
            int currentthread = thread.peek();

            if (currentthread >= currentTask && currentTask != value) {
                tasks.pop();
                thread.pop();
            } else if (currentthread < currentTask && currentTask != value) {
                thread.pop();
            } else if (currentthread >= currentTask && currentTask == value) {
                System.out.println("Thread with value " + currentthread + " killed task " + value);
                break;
            } else if (currentthread < currentTask && currentTask == value) {
                System.out.println("Thread with value " + currentthread + " killed task " + value);
                break;
            }

        }

        String result = thread.stream().map(String::valueOf).collect(Collectors.joining(" ")).toString().trim();
        System.out.println(result);
    }
}
