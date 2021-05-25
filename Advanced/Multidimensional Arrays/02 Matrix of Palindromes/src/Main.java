import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] line=sc.nextLine().split(" ");

      int row=Integer.parseInt(line[0]);
      int cow=Integer.parseInt(line[1]);
      char[] endRow=Character.toChars(97+row);
      char[] endCow=Character.toChars(97+cow);

      for(char i='a';i<endRow[0];i++){
          char current=i;

          for(char j=current;j<endCow[0]  ;j++){

              System.out.printf("%c%c%c ", i , j , i);
          }
          endCow[0]++;
          System.out.println();
      }

    }
}
