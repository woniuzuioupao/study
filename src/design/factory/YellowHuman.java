package design.factory;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
