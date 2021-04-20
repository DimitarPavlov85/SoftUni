import java.util.Scanner;

public class Main {
    enum Month {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        Octomber,
        November,
        December,
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner((System.in))) {
            int digit = Integer.parseInt(sc.nextLine());

            switch (digit) {
                case 1:
                    System.out.print(Month.January);
                    break;
                case 2:
                    System.out.print(Month.February);
                    break;
                case 3:
                    System.out.print(Month.March);
                    break;
                case 4:
                    System.out.print(Month.April);
                    break;
                case 5:
                    System.out.print(Month.May);
                    break;
                case 6:
                    System.out.print(Month.June);
                    break;
                case 7:
                    System.out.print(Month.July);
                    break;
                case 8:
                    System.out.print(Month.August);
                    break;
                case 9:
                    System.out.print(Month.September);
                    break;
                case 10:
                    System.out.print(Month.Octomber);
                    break;
                case 11:
                    System.out.print(Month.November);
                    break;
                case 12:
                    System.out.print(Month.December);
                    break;
                default:{
                    System.out.print("Error!");
                }
            }
        }
    }
}

