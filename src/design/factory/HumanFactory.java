package design.factory;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class HumanFactory implements AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human= null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){

        }

        return (T) human;
    }

    public static <T extends Human> T staticCreateHuman(Class<T> c) {
        Human human= null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){

        }

        return (T) human;
    }
}
