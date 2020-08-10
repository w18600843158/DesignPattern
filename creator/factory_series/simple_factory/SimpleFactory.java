package creator.factory_series.simple_factory;


public class SimpleFactory {
    public static AbstractProduct newProduct(String type) {
        if (type.equals("A")){
            return new ProductA();
        }

        if (type.equals("B")){
            return new ProductB();
        }
        else {
            System.out.println("生产不出这种产品");
            return null;
        }
    }



}
