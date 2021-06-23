package bakery;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class Bakery {
    private String name;
    private int capacity;
    List<Employee> employees;


   public Bakery(String _name, int _capacity) {
        this.name = _name;
        this.capacity = _capacity;
        this.employees = new ArrayList<>(capacity);
         
    }

    public void add(Employee employee) {
        if(employees.size()<capacity){
            this.employees.add(employee);
        }
    }

    public boolean remove(String name) {
        if (this.employees.removeIf(e -> e.getName().equals(name))) {
            return true;
        }
        return false;
    }

    public Employee getOldestEmployee() {
        if(employees.size()==0){
            return null;
        }
        return Collections.max(employees, (a, b) -> {
            if (a.getAge() > b.getAge()) {
                return 1;
            } else if (a.getAge() < b.getAge()) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    public Employee getEmployee(String name) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                return employees.get(i);
            }
        }
        return null;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder br = new StringBuilder();
        br.append("Employees working at Bakery " + name + ":"+System.lineSeparator());
        for (int i = 0; i < employees.size(); i++) {
            br.append(employees.get(i).toString() +System.lineSeparator());
        }
        return br.toString().trim();
    }
}