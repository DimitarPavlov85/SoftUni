import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
         String current=sc.nextLine();
        LinkedHashSet<Trainer> trainer=new LinkedHashSet<>();
         while(!current.equals("Tournament")){

            String[]data=current.split(" ");
            Pokemon pokemon=new Pokemon(data[1],data[2],Integer.parseInt(data[3]));
            boolean isThere=false;
             for(Trainer t:trainer){
                 if(t.getName().equals(data[0])){
                     t.getCollections().add(pokemon);
                     isThere=true;
                 }
             }
             if(isThere==false){
                 Trainer tr=new Trainer(data[0],pokemon );
                 trainer.add(tr);
             }


             current=sc.nextLine();
         }
         current=sc.nextLine();
         while(!current.equals("End")){

             if(current.equals("Fire")) {
                 for (Trainer tr : trainer) {
                     boolean isMaigic = false;
                     for (int i = 0; i < tr.getCollections().size(); i++) {
                         if (tr.getCollections().get(i).getMagic().equals("Fire")) {
                             tr.setNumberOfBadges(1);
                             isMaigic = true;
                            break;
                         }
                     }
                     if (isMaigic == false) {
                         tr.getCollections().stream().map(e -> e.setHealth()).collect(Collectors.toList());
                         for (int i = 0; i < tr.getCollections().size(); i++) {
                             if (tr.getCollections().get(i).getHealth()<=0) {
                                 tr.getCollections().remove(i);i--;
                             }
                         }
                     }

                 }
             }
             else if(current.equals("Water"))
             {
                 for (Trainer tr : trainer) {
                     boolean isMaigic = false;
                     for (int i = 0; i < tr.getCollections().size(); i++) {
                         if (tr.getCollections().get(i).getMagic().equals("Water")) {
                             tr.setNumberOfBadges(1);
                             isMaigic = true;
                             break;
                         }
                     }
                     if (isMaigic == false) {
                         tr.getCollections().stream().map(e -> e.setHealth()).collect(Collectors.toList());
                         for (int i = 0; i < tr.getCollections().size(); i++) {
                             if (tr.getCollections().get(i).getHealth()<=0) {
                                 tr.getCollections().remove(i);i--;
                             }
                         }
                     }

                 }
             }
             else if(current.equals("Electricity")){
                 for (Trainer tr : trainer) {
                     boolean isMaigic = false;
                     for (int i = 0; i < tr.getCollections().size(); i++) {
                         if (tr.getCollections().get(i).getMagic().equals("Electricity")) {
                             tr.setNumberOfBadges(1);
                             isMaigic = true;
                             break;
                         }
                     }
                     if (isMaigic == false) {
                         tr.getCollections().stream().map(e -> e.setHealth()).collect(Collectors.toList());
                         for (int i = 0; i < tr.getCollections().size(); i++) {
                             if (tr.getCollections().get(i).getHealth()<=0) {
                                    tr.getCollections().remove(i);i--;
                             }
                         }
                     }

                 }
             }
             current = sc.nextLine();
         }

           trainer.stream().sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed())
                           .forEach(s-> System.out.println(s.getName()+ " "+s.getNumberOfBadges()+" "+s.getCollections().size()));

    }
}
