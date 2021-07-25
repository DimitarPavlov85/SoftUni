package vehicle;

public class Vehicle {
    private  static final double DEFAULT_FUEL_CONSUMPTION=1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel,int horsePower){
        this.fuel=fuel;
        this.horsePower=horsePower;
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void drive (double kilometers){
        double consumption=getFuel()-(kilometers)*fuelConsumption;
        if(consumption>=0){
            this.setFuel(consumption);
        }

    }
    public void setFuelConsumption(double DEFAULT_FUEL_CONSUMPTION){
        this.fuelConsumption=DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
