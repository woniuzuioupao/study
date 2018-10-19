package design.proxy.first;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class client {

    public static void main(String[] args) {
        IGamePlayer gamePlayerProxy = new GamePlayerProxy("李四");
        gamePlayerProxy.login("lisi001","123456");
        gamePlayerProxy.killBoss();
    }
}
