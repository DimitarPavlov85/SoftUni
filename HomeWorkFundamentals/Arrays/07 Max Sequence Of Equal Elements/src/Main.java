import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Line=sc.nextLine();
        String [] ArrayOfString =Line.split(" ");
        int []ArrayOfDigits =new int[ArrayOfString.length];
        for (int i=0;i<ArrayOfDigits.length;i++){
            ArrayOfDigits[i]=Integer.parseInt(ArrayOfString[i]);
        }
        int CurrentDigit=0;
        int CountOfEqual=0;
        int ResultOfDigit=0;
        int CountOfResultDigits=0;

        for (int i=0;i<ArrayOfDigits.length-1;i++){
            if(ArrayOfDigits[i]==ArrayOfDigits[i+1]){
                CurrentDigit=ArrayOfDigits[i];
                CountOfEqual++;
            }
          else if(ArrayOfDigits[i]!=ArrayOfDigits[i+1]){
                if(CountOfEqual>CountOfResultDigits){
                    CountOfResultDigits=CountOfEqual;
                    ResultOfDigit=CurrentDigit;
                    CountOfEqual=0;
                }
                else if(CountOfEqual==CountOfResultDigits){
                    CountOfEqual=0;
                }
            }
        }
        if(CountOfResultDigits==0){
            CountOfResultDigits=CountOfEqual;
            ResultOfDigit=CurrentDigit;
        }
        if(ArrayOfDigits.length==1){
            ResultOfDigit=ArrayOfDigits[0];
        }
        for(int i=0;i<=CountOfResultDigits;i++){
            System.out.printf("%d%s",ResultOfDigit," ");
        }
    }
}
