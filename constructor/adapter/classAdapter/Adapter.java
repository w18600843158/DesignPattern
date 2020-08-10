package constructor.adapter.classAdapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        /**
         * 适配类的方法
         */
        super.request();
    }
}
