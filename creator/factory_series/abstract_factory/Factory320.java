package creator.factory_series.abstract_factory;

public class Factory320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new Engine320();
    }

    @Override
    public AirCondition createAirCondition() {
        return new AirCondition320();
    }
}
