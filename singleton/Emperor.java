package singleton;

import java.util.Random;

//皇帝实现类
public class Emperor implements Iemperor{
    //添加 vlolatile 声明,保证实例化是一个原子操作,防止 jvm 优化引起的指令重排,导致 emperor 未构造而富于地址
    private static volatile Emperor emperor;
    //皇帝 Id
    private String id;
    //防止破坏单例
    private Emperor(String id){
        this.id = id;
    }

    @Override
    public void sayCommand(String str){
        System.out.println(str + this.id);
    }

    //取得单例
    //不用同步,多线程可能会创建多个实例
//    public static Emperor getEmperor(){
    public static Emperor getEmperor(){
        if (emperor == null){
            //在静态代码块中使用同步语句
            synchronized (Emperor.class){
                if (emperor == null){
                    emperor = new Emperor(new Random().nextInt()+"");
                }
            }
        }
        return emperor;
    }
}
