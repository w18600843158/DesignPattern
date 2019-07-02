package singleton;

//场景
public class Client {
    public static void main(String[] args){
        for (int i = 0 ; i<10; i++){
            Emperor.getEmperor().sayCommand("参见皇上");
        }
    }
}
