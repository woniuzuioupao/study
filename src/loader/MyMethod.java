package loader;

/**
 * 类描述:
 *
 * @createdtime 2018/9/4
 */
public class MyMethod {
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();
        myMethod.commonM();
        myMethod.finalM();
        myMethod.ataticM();
        myMethod.privateM();

    }
    public void commonM(){}
    public void finalM(){}
    public static void ataticM(){}
    private void privateM(){}
}
