package groomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;
    public Pet(String _name,int _age,String _owner){
        this.name=_name;
        this.age=_age;
        this.owner=_owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }
    @Override
    public String toString(){
        StringBuilder br=new StringBuilder();
        return br.append(getName()+" "+getAge()+" - ("+getOwner()+")").toString().trim();
    }
}
