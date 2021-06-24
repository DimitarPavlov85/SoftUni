package vetClinic;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String _name,int _age,String _owner){
        this.name = _name;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String toString(){
        StringBuilder br=new StringBuilder();
      return   br.append(getName()+" "+getAge()+" ("+getOwner()+")"+"\n").toString().trim();
    }
}
