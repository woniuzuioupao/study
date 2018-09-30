import java.io.InputStream;
import java.util.*;
import java.util.concurrent.*;

public class TestClass {

    public static void main(String[] args) throws Exception{
        //SubClass.m1();
        //System.out.println(SubClass.su);
        //SubClass SubClass = new SubClass();
        Timer timer = new Timer();

        //ScheduledExecutorService
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("延时任务");
            }
        },5000);
        System.out.println("主流程");
    }
}
class SuperClass{
    public static String su = "aa";
    static {
        System.out.println("init SuperClass");
    }
    public static void m1(){

    }
}

class SubClass extends SuperClass{
    static int p1 ;
    static int p2 ;
    static {
        p1 = 1;
        p2 = 2;
        System.out.println(SubClass.p1);
        System.out.println(SubClass.p3);
        p1 = 1;
        p2 = 2;
        System.out.println("init SubClass");
    }
    public static void m1(){

    }
    static int p3;
}
interface S{
    short i = 1;
}
