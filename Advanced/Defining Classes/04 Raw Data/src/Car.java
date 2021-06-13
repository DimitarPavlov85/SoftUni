public class Car {

    Engine engine;
    Cargo cargo;
    Tyre tyre;
    Car(String _model,int _engineSpeed,int _enginePower,int _weight,String _cargoType,
        double _tyre1Pressure,int _tyre1Age,
        double _tyre2Pressure,int _tyre2Age,
        double _tyre3Pressure,int _tyre3Age,
        double _tyre4Pressure,int _tyre4Age){

        engine=new Engine(_model,_engineSpeed,_enginePower);
        cargo =new Cargo(_weight,_cargoType);
        tyre=new Tyre(_tyre1Pressure,_tyre1Age,_tyre2Pressure,_tyre2Age,_tyre3Pressure,_tyre3Age,_tyre4Pressure,_tyre4Age);
    }
}
