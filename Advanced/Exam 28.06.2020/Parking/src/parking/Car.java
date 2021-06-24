package parking;

public class Car {
    private String manufacturer;
    private String model;
    private int year;

    public Car(String _manufacturer, String _model, int _year) {
        this.manufacturer = _manufacturer;
        this.model = _model;
        this.year = _year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder br = new StringBuilder();
        return br.append(getManufacturer() + " " + getModel() + " (" + getYear()+")").toString().trim();
    }
}
