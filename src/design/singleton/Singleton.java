package design.singleton;

/**
 * 类描述:单例模式（饿汉模式）
 *
 * @createdtime 2018/9/27
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
/**
 * 类描述:单例模式（懒汉模式）
 */
class SingletonLazy {

    private static final SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getSingletonLazy(){

        if(singletonLazy == null){
            return new SingletonLazy();
        }

        return singletonLazy;
    }


}
