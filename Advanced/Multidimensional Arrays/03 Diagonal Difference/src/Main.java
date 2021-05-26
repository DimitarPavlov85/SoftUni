
import java.util.Scanner;

public class Main {
    public static int [][] createMatrix(int size,Scanner sc){
        int [][] current=new int[size][size];
        for(int i=0;i<size;i++){
            String [] line=sc.nextLine().split(" ");
            for(int j=0;j<size;j++){
                current[i][j]=Integer.parseInt(line[j]);
            }
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int size=Integer.parseInt(sc.nextLine());
        int [][] matrix=createMatrix(size,sc);
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<=i;j++){
                leftSum+=matrix[i][j];

            }
        }
        for(int i=0;i<size;i++){
            for(int j=size-1-i;j>=size-1-i;j--){
                rightSum+=matrix[i][j];
            }
        }
        System.out.println(Math.abs(rightSum-leftSum));
    }
}
