import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumberOfPerson = Integer.parseInt(sc.nextLine());
        int ElevatorCapacity = Integer.parseInt(String.valueOf(sc.nextInt()));
        if (NumberOfPerson <= ElevatorCapacity) {
            System.out.printf("%d", 1);
        } else if (NumberOfPerson > ElevatorCapacity) {
            int FullCourses = NumberOfPerson / ElevatorCapacity;
            int LastCorses = NumberOfPerson - (FullCourses * ElevatorCapacity);
            if (NumberOfPerson % ElevatorCapacity == 0) {
                System.out.printf("%d", FullCourses);
            } else if (NumberOfPerson % ElevatorCapacity != 0) {
                System.out.printf("%d", FullCourses + 1);

            }
        }
    }
}
