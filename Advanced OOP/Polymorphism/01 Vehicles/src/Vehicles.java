import java.text.DecimalFormat;

public  abstract class Vehicles {

    private double fuelConsumtion;
    private double fuelQuantity;

    public Vehicles(double fuelQuantity, double fuelCnsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumtion = fuelCnsumption;
    }


    void canBeDrivenInDistance(Double distance) {
        if(distance*(fuelConsumtion)<=fuelQuantity){
            fuelQuantity-=distance*(fuelConsumtion);
            System.out.printf("%s travelled "+new DecimalFormat("#.##").format(distance)+" km\n",
                    this.getClass().getName(),distance);
        }
        else{
            System.out.printf("%s needs refueling\n",this.getClass().getSimpleName());
        }
    }

    void refueled(double fuel) {

        fuelQuantity+=fuel;
    }

    public double getFuelConsumtion() {
        return fuelConsumtion;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
}
