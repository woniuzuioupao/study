package design.proxy.second;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class GamePlayer implements IGamePlayer {

    private String userName;

    private IGamePlayer proxy = null;

    public GamePlayer(String userName) {

        this.userName = userName;
    }

    @Override
    public void login(String Name, String password) {
        if(isProxy()){
            System.out.println(this.userName + "登陆游戏");
        }else {
            System.out.println("请使用代理");
        }

    }

    @Override
    public void killBoss() {
        if(isProxy()){
            System.out.println(this.userName + "杀敌");
        }else{
            System.out.println("请使用代理");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
    private Boolean isProxy(){
        if(this.proxy != null){
            return true;
        }else{
            return false;
        }
    }
}
