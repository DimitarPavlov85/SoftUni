import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void PrintList(List<String>Current){
        for(String CurrentName:Current){
            System.out.println(CurrentName);
        }
    }
    public static void main(String[] args) {
        List<String>Guest= new ArrayList<String>();
        Scanner sc =new Scanner(System.in);
        int Lines=Integer.parseInt(sc.nextLine());

        for(int i=0;i<Lines;i++){
            String Commands=sc.nextLine();
            String [] NameAndIvent=Commands.split(" ");

             if(NameAndIvent[1].equals("is")&& !NameAndIvent[2].equals("not")){
                boolean IsThere=false;
                for(int j=0;j<Guest.size();j++){
                    if(Guest.get(j).equals(NameAndIvent[0])){
                        System.out.print(NameAndIvent[0]+ " is already in the list!\n");
                        IsThere=true;
                        break;
                    }
                }
                if(IsThere==false){
                    Guest.add(NameAndIvent[0]);
                }
            }
            else if(NameAndIvent[2].equals("not")){
                boolean IsThere=false;
                for(int k=0;k<Guest.size();k++){
                    if(Guest.get(k).equals(NameAndIvent[0])){
                        Guest.remove(k);
                        IsThere=true;
                    }
                }
                if(IsThere==false){
                    System.out.print(NameAndIvent[0]+" is not in the list! \n");
                }
            }
        }
        PrintList(Guest);
    }
}
