/**
 * 类描述:
 *
 * @createdtime 2018/8/7
 */
public class ThreadTest {
    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println("start...");
                C c = new C();
                System.out.println("end...");
            }
        };
        Thread t1 = new Thread(script);
        Thread t2 = new Thread(script);
        t1.start();
        t2.start();
    }
}
class C{

    static {

        if(true){

            while (true){

            }
        }

    }
}
