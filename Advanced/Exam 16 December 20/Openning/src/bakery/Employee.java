package bakery;

public class Employee {
    private  String name;
    private int age;
    private String country;
    public Employee(String _name,int _age,String _country){
        this.name=_name;
        this.age=_age;
        this.country=_country;
    }
public Employee(){};
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
    @Override
   public  String toString (){
        return String.format("Employee: "+getName()+", "+getAge()+" ("+getCountry()+")").trim();
    }
}
