package constructor.proxy.staticProxy;

public class Proxy implements Service {
    private ServiceImpl serviceImpl ;

    public Proxy(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    @Override
    public void update() {
        System.out.println("在代理中使用委托对象的方法 update()");
        serviceImpl.update();
    }

    @Override
    public Object find() {
        System.out.println("在代理中使用委托对象的方法 find()");
        return serviceImpl.find();
    }
}
