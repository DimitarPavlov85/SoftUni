package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    List<Pet> data;
    public GroomingSalon(int _capacity){
        this.capacity=_capacity;
        this.data=new ArrayList<>();
    }
    public void add (Pet pet){
        if(data.size()<capacity&&capacity>0){
            data.add(pet);
        }
    }
    public boolean remove (String name){
        for(int i=0;i<data.size();i++){
            if(data.get(i).getName().equals(name)){
                data.remove(i);
                return true;
            }
        }
        return false;
    }
    public Pet getPet(String name,String owner){
           for(int i=0;i<data.size();i++){
               if (data.get(i).getName().equals(name) && data.get(i).getOwner().equals(owner)) {

                   return data.get(i);
               }
           }
           return null;
    }
    public int getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder br=new StringBuilder();
        br.append("The grooming salon has the following clients:").append(System.lineSeparator());
        for(Pet p:data){
            br.append(p.getName()+" "+p.getOwner()).append(System.lineSeparator());
        }
        return br.toString().trim();
    }
}
