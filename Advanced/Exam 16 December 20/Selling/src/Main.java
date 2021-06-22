import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        char [][] matrix=new char[number][number];
        int row=0;
        int cow=0;
        for (int i = 0; i < number; i++) {
               String line=sc.nextLine();
               matrix[i]=line.toCharArray();
               if(line.contains("S")){
                   row = i;
                   cow= line.indexOf("S");
               }
        }
        int sum = 0;
        boolean isActive=false;
        while (isActive==false) {
            String comand = sc.nextLine();

            if (comand.equals("up")){
                int newRow=row-1;
                int newCow=cow;
                matrix[row][cow]='-';

                if(newRow<0){
                    System.out.println("Bad news, you are out of the bakery.");
                    isActive=true;
                    break;
                }
                else if(matrix[newRow][newCow]=='O'){
                    matrix[newRow][newCow]='-';
                    for (int i = 0; i < number; i++) {
                        for (int j =0; j < number; j++) {
                            if (matrix[i][j] == 'O') {
                                row = i;
                                cow = j;
                                matrix[row][cow]='S';
                                break;
                            }
                        }
                    }
                }
                else if(row-1>=0){

                    matrix [row][cow]='-';
                    if(Character.isDigit(matrix [newRow][newCow])){
                        int currentValue=Character.getNumericValue(matrix[newRow][newCow]);
                        sum+=currentValue;
                    }
                    if(sum>50){
                        isActive=true;
                        System.out.println("Good news! You succeeded in collecting enough money!");

                    }
                    matrix [row-1][cow]='S';
                    row=newRow;
                    cow=newCow;
                }
            }
            if (comand.equals("down")){
                int newRow=row+1;
                int newCow=cow;
                matrix[row][cow]='-';
                if(newRow>number-1){
                    System.out.println("Bad news, you are out of the bakery.");
                    isActive=true;
                    break;
                }
                else if(matrix[newRow][newCow]=='O'){

                    matrix[newRow][newCow]='-';
                    for (int i = 0; i < number; i++) {
                        for (int j = 0; j < number; j++) {
                            if (matrix[i][j] == 'O') {
                                row = i;
                                cow = j;
                                matrix[row][cow]='S';
                                break;

                            }
                        }
                    }
                }
                else if(newRow<number){

                    matrix[row][cow]='-';
                    if(Character.isDigit(matrix[newRow][newCow])){
                        int currentValue=Character.getNumericValue(matrix[newRow][newCow]);
                        sum+=currentValue;
                    }

                    if(sum>50){
                        isActive=true;
                        System.out.println("Good news! You succeeded in collecting enough money!");
                    }
                    matrix[newRow][newCow]='S';
                    row=newRow;
                    cow=newCow;
                }
            }
            if (comand.equals("left")) {
                int newRow = row;
                int newCow = cow - 1;
                matrix[row][cow]='-';
                if (newCow < 0) {
                    System.out.println("Bad news, you are out of the bakery.");
                    isActive = true;
                    break;
                } else if (matrix[newRow][newCow]=='O') {

                    matrix[newRow][newCow]='-';
                    for (int i = 0; i <number; i++) {
                        for (int j = 0; j < number; j++) {
                            if (matrix[i][j] == 'O') {
                                row = i;
                                cow = j;
                                matrix[row][cow]= 'S';
                                break;

                            }
                        }
                    }
                } else if (newCow < number - 1) {


                    if (Character.isDigit(matrix [newRow][newCow])) {
                        int currentValue = Character.getNumericValue(matrix [newRow][newCow]);
                        sum += currentValue;
                    }
                    if (sum > 50) {
                        isActive = true;
                        System.out.println("Good news! You succeeded in collecting enough money!");
                    }
                    matrix[newRow][newCow]= 'S';
                    row = newRow;
                    cow = newCow;
                }
            }
            if (comand.equals("right")){
                int newRow=row;
                int newCow=cow+1;
                matrix[row][cow]='-';
                if(newCow>number-1){
                    System.out.println("Bad news, you are out of the bakery.");
                    isActive=true;
                    break;
                }
                else if(matrix[newRow][newCow]=='O'){

                    matrix [newRow][newCow]='-';
                    for (int i = 0; i < number; i++) {
                        for (int j = 0; j <number; j++) {
                            if (matrix[i][j] == 'O') {
                                row = i;
                                cow = j;
                                matrix[row][cow]='S';
                                break;
                            }
                        }
                    }
                }
                else if(newCow<number-1){

                    if(Character.isDigit(matrix[newRow][newCow])){
                        int currentValue=Character.getNumericValue(matrix[newRow][newCow]);
                        sum+=currentValue;
                    }
                    if(sum>50){
                        isActive=true;
                        System.out.println("Good news! You succeeded in collecting enough money!");

                    }
                    matrix[newRow][newCow]='S';
                    row=newRow;
                    cow=newCow;

                }
            }
        }
        System.out.println("Money: " + sum);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix [i][j]);
            }
            System.out.println();
        }
    }
}


