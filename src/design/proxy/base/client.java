package design.proxy.base;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.login("zhangsan001","123456");
        gamePlayerProxy.killBoss();
    }
}
