package design.proxy.third;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("王五");

        //真实对象
        player.login("wangwu001","123456");
        player.killBoss();

        //代理对象
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(player);
        gamePlayerProxy.login("wangwu001","123456");
        gamePlayerProxy.killBoss();

        IGamePlayer getGamePlayerProxy = player.getProxy();
        gamePlayerProxy.login("wangwu001","123456");
        gamePlayerProxy.killBoss();







    }
}
