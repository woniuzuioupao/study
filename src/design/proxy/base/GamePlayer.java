package design.proxy.base;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class GamePlayer implements IGamePlayer{

    private String userName;

    public GamePlayer(String userName) {
        this.userName = userName;
    }

    @Override
    public void login(String Name, String password) {
        System.out.println(this.userName + "登陆游戏");
    }

    @Override
    public void killBoss() {
        System.out.println(this.userName + "杀敌");
    }
}
