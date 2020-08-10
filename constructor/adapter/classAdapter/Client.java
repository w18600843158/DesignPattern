package constructor.adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        /**
         * 事实上实例化的是 target 的具体子类
         */
        Target target = new Adapter();
        target.handleReq();
    }
}
