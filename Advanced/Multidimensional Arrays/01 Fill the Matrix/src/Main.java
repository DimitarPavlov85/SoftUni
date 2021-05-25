

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line = sc.nextLine().split(", ");
        int size = Integer.parseInt(line[0]);
        int[][] array = new int[size][size];

        if (line[1].equals("A")) {
            typeA(size, array);
        } else {
            typeB(array, size);
        }

        printMatrix(array);
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void typeB(int arrays[][], int size) {
        for (int i = 1; i <= size; i++) {
            int step = i;

            for (int j = 1; j <= size; j++) {
                if (j == 1) {
                    arrays[i - 1][j - 1] = step;

                }
                if (j % 2 == 0 && i == 1) {
                    step = size * j;
                    arrays[i - 1][j - 1] = step;
                }
                if (j % 2 != 0 && i == 1 && j != 1) {
                    step++;
                    arrays[i - 1][j - 1] = step;
                }

                if (i != 1 && j % 2 != 0 && j != 1) {
                    int current = arrays[i - 2][j - 1];
                    current++;
                    arrays[i - 1][j - 1] = current;
                }
                if (i != 1 && j % 2 == 0 && j != 1) {
                    int current = arrays[i - 2][j - 1];
                    current--;
                    arrays[i - 1][j - 1] = current;
                }
            }
        }
    }

    public static void typeA(int size, int[][] array) {
        for (int i = 1; i <= array.length; i++) {
            int step = i;

            for (int j = 1; j <= size; j++) {
                if (j == 1) {
                    array[i - 1][j - 1] += step;
                    step += size;
                } else {
                    array[i - 1][j - 1] += step;
                    step += size;
                }
            }
        }
    }
}
