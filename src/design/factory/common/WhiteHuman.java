package design.factory.common;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
