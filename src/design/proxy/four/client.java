package design.proxy.four;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class client {

    public static void main(String[] args) throws Throwable{

        IGamePlayer player = new GamePlayer("赵六");
        InvocationHandler handler = new IGamePlayerIH(player);
        ClassLoader classLoader = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);
        //真实对象
        proxy.login("zhaoliu001","123456");
        proxy.killBoss();
    }
}
