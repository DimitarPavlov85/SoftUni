import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\Dimitar\\Desktop\\input.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String current="";

        while ((current=br.readLine())!=null){
            int sum=0;
            for(int i=0;i<current.length();i++){
                sum+=current.charAt(i);
            }

            System.out.println(sum);
        }
    }
}
