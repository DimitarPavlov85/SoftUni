import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name,int number) {
        this.setName(name);
        this.setToppings(number);
    }

    private void setName(String name) {
        if(name.trim().isEmpty()||name.length()>15){
            String message=String.format("Pizza name should be between 1 and 15 symbols.");
            throw new IllegalArgumentException(message);
        }
        this.name = name;
    }

    public void setDough(Dough dought) {
        this.dough = dought;
    }

    private void setToppings(int capacity) {
        if(capacity<0||capacity>10){
            String message=String.format("Number of toppings should be in range [0..10].");
            throw new IllegalArgumentException(message);
        }
        this.toppings = new ArrayList<>(capacity);
    }

    public String getName() {
        return name;
    }
    public void addTopping(Topping t){
        this.toppings.add(t);
    }
    public double getOverallCalories(){

        return this.dough.calculateCalories()+ this.toppings.stream( ).mapToDouble(Topping::calculateCalories).sum();
    }
}
