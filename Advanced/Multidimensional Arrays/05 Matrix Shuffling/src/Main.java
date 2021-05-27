import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rowAndCow = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String[][] matrix = createMatrix(sc, rowAndCow[0], rowAndCow[1]);
        String[] comand = sc.nextLine().split(" ");
        while (!comand[0].equals("END")) {
            if (isCorect(comand,rowAndCow[0],rowAndCow[1])) {
                swapMatrix(matrix,comand);
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }

            comand = sc.nextLine().split(" ");
        }
    }
    public static void swapMatrix(String [][]matrix,String[] comand){
        int row1=Integer.parseInt(comand[1]);
        int cow1=Integer.parseInt(comand[2]);
        int row2=Integer.parseInt(comand[3]);
        int cow2=Integer.parseInt(comand[4]);
        String current=matrix[row1][cow1];
        matrix[row1][cow1]=matrix[row2][cow2];
        matrix[row2][cow2]=current;
    }
public static boolean isCorect(String [] comand,int row,int cow){
    if(comand.length!=5){
        return false;
    }
        int row1=Integer.parseInt(comand[1]);
        int cow1=Integer.parseInt(comand[2]);
        int row2=Integer.parseInt(comand[3]);
        int cow2=Integer.parseInt(comand[4]);

        if(!comand[0].equals("swap")){
            return false;
        }
        if(row1<=row && row1>=0 && cow1<=cow&& cow1>=0 && row2<=row && row2>=0 &&cow2<=cow && cow2>=0){
            return true;
        }

        return false;
}
    public static void printMatrix(String[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static String[][] createMatrix(Scanner sc, int i1,int cow) {
        String[][] matrix = new String[i1][cow];
        for (int i = 0; i < i1; i++) {
            String[] currentArr =sc.nextLine().split(" ");
            for (int j = 0; j < cow; j++) {
                matrix[i][j] = currentArr[j];
            }
        }
        return matrix;
    }

}