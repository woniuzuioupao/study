package loader;

/**
 * 类描述:
 *
 * @createdtime 2018/8/29
 */
public class FiledLoader {

    public static final String s;
    static {
        s="";
        ss="";
    }
    public static final String ss;

    interface In1{
        int a = 1;
    };
    interface In2 extends In1{
        public static final int a = 2;
    };
    interface In3{
        int a = 3;
    };
    static class innerClass1 extends innerClass3 implements In2{
        public static int a = 1;
    }
    static class innerClass3{
        public static int a = 1;
    }
    static class innerClass2 extends innerClass1 implements In2{
        public static int a = 1;
    }

    public static void main(String[] args) {
        System.out.println(innerClass2.a);
        Dog dog = new Dog();
        System.out.println(dog.className);
        dog.run();
        Init animal = new Animal();
        System.out.println(animal.className);
        animal.run();
    }

}

class Dog extends Animal{
    static {
        System.out.println("creat Dog");
    }

    public String className = "dog";
    public void run(){
        System.out.println("Dog run()");
    }
}

class Animal extends Init{
    static {
        System.out.println("creat Animal");
    }

    public String className = "animal";
    public void run(){
        System.out.println("Animal run()");
    }
}

class Init{
    static {
        System.out.println("creat Init");
    }
    public String className = "init";
    public void run(){
        System.out.println("Init run()");
    }
}
