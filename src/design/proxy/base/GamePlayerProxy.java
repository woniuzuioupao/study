package design.proxy.base;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String userName, String password) {
        gamePlayer.login(userName,password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }
}
