package creator.factory_series.factory;

public class FactoryBMW525 implements FactoryBMW {
    @Override
    public BMW525 createBMW() {
        return new BMW525();
    }
}
