package creator.factory_series.simple_factory;

public class Client {
    public static void main(String[] args) {
        AbstractProduct product = SimpleFactory.newProduct("A");
        assert (product instanceof ProductA);
    }
}
