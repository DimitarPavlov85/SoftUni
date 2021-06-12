
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());
        List<Employee> data = new ArrayList<>();

        CreateListOfEmployee(sc, numberOfLines, data);

        Map<String, Double> isaverage = getStringDoubleMap(data);
        LinkedHashMap<String,Double>revers=new LinkedHashMap<>();
        isaverage.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(e->revers.put(e.getKey(),e.getValue()));

        String resultDepartment="";
        for (Map.Entry<String,Double> s:revers.entrySet()) {
            resultDepartment=s.getKey();
            break;
        }
     System.out.println("Highest Average Salary: "+resultDepartment);
        String  finalResultDepartment = resultDepartment;
        Comparator<Employee>compareSalary=(a,b)->{
            if(a.getSalary()<b.getSalary()){
                return  1;
            }else if(a.getSalary()>b.getSalary()) {
              return -1;
            }
            return 0;
        };
        data.stream().filter(e->e.getDepartment()
                .equals(finalResultDepartment))
                .sorted(compareSalary)
                .forEach(e-> System.out.printf("%s %.2f %s %s\n",e.getName(),e.getSalary(),e.getEmail(),e.getAge()));
    }
    private static Map<String, Double> getStringDoubleMap(List<Employee> data) {
        Map<String,Double>isaverage= data.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors
                                                 .averagingDouble(Employee::getSalary)));
        return isaverage;
    }
    private static void CreateListOfEmployee(Scanner sc, int numberOfLines, List<Employee> data) {
        for (int i = 0; i < numberOfLines; i++) {
            String[] line = sc.nextLine().split("\\s+");
            Employee current = new Employee();
            if (line.length == 4) {
                current = new Employee(line[0], Double.parseDouble(line[1]), line[2], line[3]);
            } else if (line.length == 6) {
                current = new Employee(line[0], Double.parseDouble(line[1]),
                        line[2], line[3], line[4],
                        Integer.parseInt(line[5]));
            } else if (line.length == 5) {
                if (line[4].contains("@")) {
                    current = new Employee(line[0], Double.parseDouble(line[1]),
                            line[2], line[3], line[4]);
                } else {
                    current = new Employee(line[0], Double.parseDouble(line[1]),
                            line[2], line[3], Integer.parseInt(line[4]));
                }
            }
            data.add(current);
        }
    }

}
