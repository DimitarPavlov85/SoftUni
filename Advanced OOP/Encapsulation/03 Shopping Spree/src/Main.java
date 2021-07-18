import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        fillListOfPersons(person, sc);

        fillListOfProducts(products, sc);

        String comand = sc.nextLine();

        while (!comand.equals("END")) {
            String nameOfClient=comand.split("\\s+")[0];
            String currentProduct=comand.split("\\s+")[1];

            buyProducts(person, products, nameOfClient, currentProduct);

            comand = sc.nextLine();
        }

        printResult(person);
    }

    private static void buyProducts(List<Person> person, List<Product > products, String nameOfClient, String currentProduct) {
        for (int i = 0; i < person.size(); i++) {
            String currentName= person.get(i).getName();
            for (int j = 0; j < products.size(); j++) {
                if (currentName.equals(nameOfClient) && products.get(j).getName().equals(currentProduct) ){
                    person.get(i).buyProduct(products.get(j));
                }
            }
        }
    }


    private static void printResult(List<Person> person) {
        for(int i = 0; i< person.size(); i++){
            System.out.printf("%s - ", person.get(i).getName());
            System.out.printf("%s", person.get(i).toString());
            System.out.println();
        }
    }

    private static void fillListOfProducts(List<Product > products, Scanner sc) {
        String[] product = sc.nextLine().split(";");
        for(int i = 0; i< product.length; i++){
            String []currentProduct= product[i].split("=");
            Product  current=new Product (currentProduct[0],Double.parseDouble(currentProduct[1]));
            products.add(current);
        }
    }
    private static void fillListOfPersons (List<Person> person, Scanner sc) {
        String[] people = sc.nextLine().split(";");
        for(int i = 0; i< people.length; i++){
            String []currentPerson= people[i].split("=");
            Person current=new Person(currentPerson[0],Double.parseDouble(currentPerson[1]));
            person.add(current);
        }
    }
}

