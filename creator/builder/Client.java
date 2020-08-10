package creator.builder;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director();

        Product product = director.constructProduct(builder);
    }
}
