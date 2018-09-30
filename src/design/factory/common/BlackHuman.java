package design.factory.common;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话");
    }
}
