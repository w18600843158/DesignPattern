package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GuiTai implements InvocationHandler {
    private Object pingtai;

    GuiTai(Object pingtai){
        this.pingtai = pingtai;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("销售开始  柜台是： "+this.getClass().getSimpleName());
        method.invoke(pingtai, args);
        System.out.println("销售结束\n");
        return null;
    }
}
