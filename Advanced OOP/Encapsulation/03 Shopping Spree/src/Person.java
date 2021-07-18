import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String _name, double _money) {
        this.setName(_name);
        this.setMoney(_money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product p) {
        if (this.money - p.getCost()<0) {
            String message =String.format("%s can't afford %s\n", this.getName(),p.getName());
           throw new IllegalArgumentException(message);
        }
        else {
            products.add(p);
            this.money-=p.getCost();
        }
    }
    /*
    @Override
    public String toString (){
        StringBuilder br=new StringBuilder();
        if(products.size()==0){
            br.append("Nothing bought");
        }
        else{
            for(int j=0;j<products.size();j++){
                if(j!=0){
                    br.append(", ");
                }
                br.append(products.get(j).getName());
            }
        }
       return br.toString().trim();
    }

     */
}
