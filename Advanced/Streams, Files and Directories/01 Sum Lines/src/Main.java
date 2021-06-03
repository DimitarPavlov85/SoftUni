import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Dimitar\\Desktop/input.txt";
        FileInputStream fileStream=new FileInputStream(path);
        String lines=fileStream.toString();
       char[]arr= lines.toCharArray();
        int sum=0;
       for(char i=0;i<arr.length;i++){
           sum+=arr[i];
       }
        System.out.println(sum);

    }
}
