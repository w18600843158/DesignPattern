package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args){
        //商品
        MaoTaiJiu maoTaiJiu = new MaoTaiJiu();//茅台酒
        Wuliangye wuliangye = new Wuliangye();//五粮液
        Furongwang furongwang = new Furongwang();//芙蓉王

        //柜台
        InvocationHandler maoTaiSeller = new GuiTai(maoTaiJiu);//茅台经销商
        InvocationHandler wuLiangYeSeller = new GuiTai(wuliangye);//五粮液经销商
        InvocationHandler fuRongWangSeller = new GuiTai(furongwang);//芙蓉王经销商

        //开始代理
        SellWine dynamicProxyMaoTai = (SellWine) Proxy.newProxyInstance(maoTaiJiu.getClass().getClassLoader(), maoTaiJiu.getClass().getInterfaces(), maoTaiSeller);
        SellWine dynamicProxyWuLiangYe = (SellWine) Proxy.newProxyInstance(wuliangye.getClass().getClassLoader(), wuliangye.getClass().getInterfaces(), wuLiangYeSeller);
        SellCigarette dynamicProxyFuRongWang = (SellCigarette) Proxy.newProxyInstance(furongwang.getClass().getClassLoader(), furongwang.getClass().getInterfaces(), fuRongWangSeller);

        //柜台类在调用方法
        dynamicProxyMaoTai.sell();//茅台经销商卖茅台
        dynamicProxyWuLiangYe.sell();//五粮液经销商卖五粮液
        dynamicProxyFuRongWang.sell();//芙蓉王经销商卖芙蓉王

    }
}
