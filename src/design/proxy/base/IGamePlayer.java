package design.proxy.base;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public interface IGamePlayer {

    /**
     * 登陆
     * @param userName
     * @param password
     */
    void login(String userName,String password);

    /**
     * 杀敌
     */
    void killBoss();

}
