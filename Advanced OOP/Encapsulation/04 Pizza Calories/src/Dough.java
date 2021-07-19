public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if(flourType.equals("White")|| flourType.equals("Wholegrain" )){
            this.flourType = flourType;
        }
        else {
            String message="Invalid type of dough.";
            throw new IllegalArgumentException(message);
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        if(bakingTechnique.equals("Crispy")||bakingTechnique.equals("Chewy")||bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }
        else{
            String message="Invalid type of dough.";
            throw new IllegalArgumentException(message);
        }
    }

    private void setWeight(double weight) {
        if(weight>=1&&weight<=200){
            this.weight = weight;
        }
        else{
            String message ="Dough weight should be in the range [1..200].";
            throw new IllegalArgumentException(message);
        }

    }
    public double calculateCalories() {
        double calories = 2 * this.weight;
        if (this.flourType.equals("White")) {
          calories=  calories *  1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            calories=  calories  * 1.0;
        }

        if (this.bakingTechnique.equals("Crispy")) {
            calories= calories  * 0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            calories=  calories *  1.1;
        } else if(this.bakingTechnique.equals("Homemade")){
            calories= calories *  1.0;
        }
        return calories;
    }
}
