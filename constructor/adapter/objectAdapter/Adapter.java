package constructor.adapter.objectAdapter;


public class Adapter implements Target {
    private Adaptee adaptee;

    Adapter(Adaptee adaptee) {
//        super();
//        System.out.println("调用父类的构造器");
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        this.adaptee.request();
    }


}
