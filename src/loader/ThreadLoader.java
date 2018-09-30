package loader;

/**
 * 类描述:
 *
 * @createdtime 2018/8/29
 */
public class ThreadLoader {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
                //new Testt();
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
class Test{
    static {
        if(true){
            System.out.println("create test");
            while (true){

            }
        }
    }
}
