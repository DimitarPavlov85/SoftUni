public class Employee {
    private String name;
    private Double salary;
    private String position;
    private String department;
    private String email;
    private int age;

public Employee(){}
   public Employee(String _name, Double _salary,String _position,String _department, String _email, int _age){
        name=_name;
        salary=_salary;
        position=_position;
        department=_department;
        email=_email;
        age=_age;
    }
    public Employee(String _name, Double _salary,String _position,String _department,  int _age){
        name=_name;
        salary=_salary;
        position=_position;
        department=_department;
        email="n/a";
        age=_age;

    }
    public Employee(String _name, Double _salary,String _position,String _department, String _email){
        name=_name;
        salary=_salary;
        position=_position;
        department=_department;
        email=_email;
        age=-1;

    }
    public Employee(String _name, Double _salary,String _position,String _department){
        name=_name;
        salary=_salary;
        position=_position;
        department=_department;
        email="n/a";
        age=-1;

    }
    public final int getAge(){
        return this.age;
    }
    public final String getName(){
       return this.name;
    }

    public final Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

}
