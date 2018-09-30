package design.factory;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public interface AbstractHumanFactory {

    <T extends Human> T createHuman(Class<T> c);
}
