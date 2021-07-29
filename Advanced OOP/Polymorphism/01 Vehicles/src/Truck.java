import java.text.DecimalFormat;

public class Truck extends Vehicles{
    private static final double FUEL_FIX=1.6;
    public Truck(double fuelQuantity, double fuelCnsumption) {
        super(fuelQuantity,fuelCnsumption+FUEL_FIX);
    }
    @Override
    void refueled(double fuel) {
        super.refueled(fuel*0.95);
    }
}
