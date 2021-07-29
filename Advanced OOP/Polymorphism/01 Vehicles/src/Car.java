import java.text.DecimalFormat;

public class Car extends Vehicles {
    private static final double FUEL_FIX=0.9;

    public Car(double fuelQuantity, double fuelCnsumption) {
      super(fuelQuantity,fuelCnsumption+FUEL_FIX);
    }

}
