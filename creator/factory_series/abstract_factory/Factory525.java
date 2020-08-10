package creator.factory_series.abstract_factory;

public class Factory525 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new Engine525();
    }

    @Override
    public AirCondition createAirCondition() {
        return new AirCondition525();
    }
}

