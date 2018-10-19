package design.proxy.four;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class IGamePlayerIH implements InvocationHandler {

    Class cl = null;
    Object obj = null;

    public IGamePlayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        return result;
    }
}
