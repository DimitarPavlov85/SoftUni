public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat")
                || toppingType.equals("Veggies")
                || toppingType.equals("Cheese")
                || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        }

       else{
           String message = String.format("Cannot place %s on top of your pizza.", toppingType);
           throw new IllegalArgumentException(message);
        }


    }

    private void setWeight(double weight) {
        if (weight <1 || weight > 50) {
            String message = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        double calories=2*this.weight;
        if(this.toppingType.equals("Meat")){
            calories=  calories*1.2;
        }
        else if(this.toppingType.equals("Veggies")){
            calories=   calories* 0.8;
        }
        else if(this.toppingType.equals("Cheese")){
            calories=  calories* 1.1;
        }
        else if(this.toppingType.equals("Sauce")){
            calories=   calories* 0.9;
        }
        return calories;
    }
}
