package singleton;

//场景
public class Client implements Runnable{
    @Override
    public void run(){
        for (int i = 0 ; i<3; i++){
            Emperor.getEmperor().sayCommand("参见皇上");
        }
    }
    public static void main(String[] args){
        Client client1 = new Client();
        Client client2 = new Client();

        Thread thread1 = new Thread(client1);
        Thread thread2 = new Thread(client2);
        thread1.start();
        thread2.start();
    }
}
