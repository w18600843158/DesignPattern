package creator.factory_series.simple_factory;

public interface AbstractProduct {
    public void use();
}

class ProductA implements AbstractProduct {
    @Override
    public void use(){
        System.out.println("A");
    }
}

class ProductB implements AbstractProduct {
    @Override
    public void use(){
        System.out.println("B");
    }
}