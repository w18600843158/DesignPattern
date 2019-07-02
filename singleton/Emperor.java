package singleton;

import java.util.Random;

//皇帝实现类
public class Emperor implements Iemperor{
    private static Emperor emperor;
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
    //使用同步,结果只创建了一个实例
    public static synchronized Emperor getEmperor(){
        if (emperor == null){
            emperor = new Emperor(new Random().nextInt()+"");
        }
        return emperor;
    }
}
