package design.proxy.first;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class GamePlayer implements IGamePlayer {

    private String userName;

    public GamePlayer(IGamePlayer gamePlayer,String userName) throws Exception{

        if(!gamePlayer.getClass().getName() .equals(GamePlayerProxy.class.getName())){
            //只能由指定代理类代理
            throw new Exception("不能创建真实对象");
        }else{
            this.userName = userName;
        }
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
