package design.factory.singletonfactory;

import design.singleton.Singleton;

import java.lang.reflect.Constructor;

/**
 * 类描述:单例工厂
 *
 * @createdtime 2018/9/30
 */
public class SingletonFactory {


    public static <T extends ISingleton> T getSingleton(Class<T> tClass){

        ISingleton singleton = null;

        try {

            Class singletonClass = Class.forName(tClass.getName());
            Constructor constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (T)constructor.newInstance();

        }catch (Exception e){

        }
            return (T)singleton;

    }

}
