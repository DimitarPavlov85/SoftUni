

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] rowAndCow=sc.nextLine().split(" ");
        int row= Integer.parseInt(rowAndCow[0]);
        int cow=Integer.parseInt(rowAndCow[1]);
        int [][] array=new int [row][cow];
        for(int i=0;i<row;i++){
            String []currentLine=sc.nextLine().split(" ");
            for(int j=0;j<cow;j++){
                array[i][j]=Integer.parseInt(currentLine[j]);
            }
        }
        int sum=Integer.MIN_VALUE;
        int first=0;int second=0;int thurd=0;int fourth=0;int fifth=0;
        int six=0;int seven=0;int eight=0;int nine=0;
        for(int i=0;i<row-2;i++){

            for(int j=0;j<cow-2;j++){
                int currentSum=array[i][j]+array[i][j+1]+array[i][j+2]+
                        array[i+1][j]+array[i+1][j+1]+array[i+1][j+2]+
                        array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                if(sum<currentSum){
                    sum=currentSum;
                    first=  array[i][j];second=array[i][j+1]; thurd=array[i][j+2];
                           fourth= array[i+1][j];fifth=array[i+1][j+1];six=array[i+1][j+2];
                            seven=array[i+2][j];eight=array[i+2][j+1];nine=array[i+2][j+2];

                }
            }
        }
        System.out.println("Sum = "+sum);
        System.out.printf("%d %d %d\n",first,second,thurd);
        System.out.printf("%d %d %d\n",fourth,fifth,six);
        System.out.printf("%d %d %d\n",seven,eight,nine);
    }
}
