package design.factory.singletonfactory;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class SingletonB implements ISingleton{

    private SingletonB(){}

    @Override
    public void desc(){
        System.out.println("我是一个单例对象B");
    }
}
