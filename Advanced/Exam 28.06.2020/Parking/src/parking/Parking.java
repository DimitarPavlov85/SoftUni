package parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Parking {
    private String type;
    private int capacity;
    private List<Car>data;
    public Parking(String _type,int _capacity){
        this.type=_type;
        this.capacity=_capacity;
        this.data=new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Car> getCars() {
        return data;
    }
    public void add(Car car){
        if(capacity>0&&this.data.size()<capacity){
            this.data.add(car);
        }

    }
    public boolean remove(String manufacturer, String model){
        int size=data.size();
       this.data=data.stream().filter(e->e.getManufacturer().equals(manufacturer)&&e.getModel().equals(model)).collect(Collectors.toList());
       return size==data.size();
    }
    public Car getLatestCar() {
        if(data.size()==0){
            return  null;
        }
      return   Collections.max(getCars(), (a, b) -> {
            if (a.getYear() > b.getYear()) {
                return 1;
            } else if (a.getYear() < b.getYear()) {
                return -1;
            } else {
                return 0;
            }
        });

    }
    public Car getCar(String manufacturer, String model){
        for(int i=0;i<data.size();i++){
            if(data.get(i).getManufacturer().equals(manufacturer)&& data.get(i).getModel().equals(model)){
                return data.get(i);

            }
        }
        return null;
    }
    public int getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuffer br=new StringBuffer();
        br.append("The cars are parked in "+getType()+":").append(System.lineSeparator());
        for(Car c:data){
            br.append(c.toString()).append(System.lineSeparator());
        }
        return br.toString().trim();
    }
}
