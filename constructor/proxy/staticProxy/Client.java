package constructor.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        Proxy proxy = new Proxy(service);
        proxy.update();
    }
}
