package creator.factory_series.abstract_factory;

public class Client {
    public static void main(String[] args) {
        // 生产 320 型宝马
        AbstractFactory factory = new Factory320();
        factory.createEngine();
        factory.createAirCondition();
    }
}
