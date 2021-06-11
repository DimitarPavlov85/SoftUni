public class People {
    private String name;
    private int age;

    People(String _name,int _age){
        this.name=_name;
        this.age=_age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
