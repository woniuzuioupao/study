package design.factory.singletonfactory;

import design.singleton.Singleton;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class Client {

    public static void main(String[] args) {
        ISingleton singletonA = SingletonFactory.getSingleton(SingletonA.class);
        singletonA.desc();
        ISingleton singletonB = SingletonFactory.getSingleton(SingletonB.class);
        singletonB.desc();
    }
}
