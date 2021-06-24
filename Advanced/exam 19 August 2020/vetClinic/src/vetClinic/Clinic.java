package vetClinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clinic {
    private int capacity;
    List<Pet> data;

    public Clinic(int _capacity) {
        this.capacity =(_capacity);
        this.data = new ArrayList<>(capacity);
    }
    public void add(Pet pet) {
        if (data.size() < capacity&& capacity>0) {
            this.data.add(pet);
        }
    }
    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName() == name) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pet getOldestPet() {
        return Collections.max(data, (a, b) -> {
            if (a.getAge() > b.getAge()) {
                return 1;
            } else if (a.getAge() < b.getAge()) {
                return -1;
            } else return 0;
        });
    }
    public Pet getPet(String name ,String owner){
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name ) && data.get(i).getOwner().equals(owner)) {
                return data.get(i);
            }
        }
        return null;
    }
    public  int  getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder br=new StringBuilder("The clinic has the following patients:"+"\n");
        for(int i=0;i<data.size();i++){
            br.append(data.get(i).getName()+" "+data.get(i).getOwner()+"\n");
        }
        return br.toString().trim();
    }
}
