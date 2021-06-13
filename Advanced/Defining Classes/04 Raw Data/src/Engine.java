public class Engine {
    private String model;
    private int engineSpeed;
    private int enginePower;

Engine(String _model ,int _engineSpeed,int _enginePower){
    this.model=_model;
    this.enginePower=_enginePower;
    this.engineSpeed=_engineSpeed;
}
    public int getEnginePower() {
        return enginePower;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public String getModel() {
        return model;
    }
}
