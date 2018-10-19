package design.proxy.first;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        try {
            //代理类代理了具体类
            this.gamePlayer = new GamePlayer(this,name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
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
