import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        char masiv[][]=new char[size][size];
        int row=0;
        int cow=0;
        for(int i=0;i<size;i++){
            String line=sc.nextLine();
            masiv[i]=line.toCharArray();
            if(line.contains("B")){
                row=i;
                cow=line.indexOf("B");
            }
        }
        String comands=sc.nextLine();
        int countResult=0;
        while(!comands.equals("End")){

            if(comands.equals("right")){
                int newRow=row;
                int newCow=cow+1;
                masiv[row][cow]='.';
                if(newCow>size-1){
                    System.out.println("The bee got lost!");
                    break;
                }
                else if(newCow<size){
                    if(masiv[newRow][newCow]=='f'){
                        countResult++;
                        masiv[newRow][newCow]='B';
                        row=newRow;
                        cow=newCow;
                    }
                    else if(masiv[newRow][newCow]=='O'){
                        masiv[newRow][newCow]='.';
                        newRow+=0;
                        newCow+=1;
                        if(masiv[newRow][newCow]=='f'){
                            countResult++;
                            masiv[newRow][newCow]='B';
                            row=newRow;
                            cow=newCow;
                        }
                    }
                }
                masiv[newRow][newCow]='B';
                row=newRow;
                cow=newCow;
            }
            if(comands.equals("down")){
                int newRow=row+1;
                int newCow=cow+0;
                masiv[row][cow]='.';
                if(newRow>size-1){
                    System.out.println("The bee got lost!");
                    break;
                }
                else {
                    if(masiv[newRow][newCow]=='f'){
                        countResult++;
                        masiv[newRow][newCow]='B';
                        row=newRow;
                        cow=newCow;
                    }
                    else if(masiv[newRow][newCow]=='O'){
                        masiv[newRow][newCow]='.';
                        newRow=newRow+1;
                        newCow+=0;
                        if(masiv[newRow][newCow]=='f'){
                            countResult++;
                            masiv[newRow][newCow]='B';
                            row=newRow;
                            cow=newCow;
                        }
                    }
                }
                masiv[newRow][newCow]='B';
                row=newRow;
                cow=newCow;
            }
            if(comands.equals("up")){
                int newRow=row-1;
                int newCow=cow+0;
                masiv[row][cow]='.';
                if(newRow<0){
                    System.out.println("The bee got lost!");
                    break;
                }
                else {
                    if(masiv[newRow][newCow]=='f'){
                        countResult++;
                        masiv[newRow][newCow]='B';
                        row=newRow;
                        cow=newCow;
                    }
                    else if(masiv[newRow][newCow]=='O'){
                        masiv[newRow][newCow]='.';
                        newRow=newRow-1;
                        newCow+=0;
                        if(masiv[newRow][newCow]=='f'){
                            countResult++;
                            masiv[newRow][newCow]='B';
                            masiv[newRow][newCow]='.';
                            row=newRow;
                            cow=newCow;
                        }
                    }
                }
                masiv[newRow][newCow]='B';
                row=newRow;
                cow=newCow;
            }
            if(comands.equals("left")){
                int newRow=row+0;
                int newCow=cow-1;
                masiv[row][cow]='.';
                if(newCow<0){
                    System.out.println("The bee got lost!");
                    break;
                }
                else {
                    if(masiv[newRow][newCow]=='f'){
                        countResult++;
                        masiv[newRow][newCow]='B';
                        row=newRow;
                        cow=newCow;
                    }
                    else if(masiv[newRow][newCow]=='O'){
                        masiv[newRow][newCow]='.';

                        newCow=newCow-1;
                        if(masiv[newRow][newCow]=='f'){
                            countResult++;
                            masiv[newRow][newCow]='B';
                            row=newRow;
                            cow=newCow;
                        }
                    }
                }
                masiv[newRow][newCow]='B';
                row=newRow;
                cow=newCow;
            }


            comands=sc.nextLine();
        }
        if(countResult<5){
            System.out.println("The bee couldn't pollinate the flowers, she needed "+ (5-countResult) +" flowers more");
        }
        else {
            System.out.println(
                    "Great job, the bee manage to pollinate "+countResult+ " flowers!");
        }
        for(int i=0;i<size;i++){

            for(int j=0;j<size;j++){
                System.out.print(masiv[i][j]);
            }
if(i!=size-1){
    System.out.println();
}

        }
    }
}
