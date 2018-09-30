package design.singleton;

/**
 * 类描述:
 *
 * @createdtime 2018/9/29
 */
public class Minister {

    public static void main(String[] args) {
        int ministerNum = 5;
        for(int i = 0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+i+"个大臣参拜的是：");
            emperor.say();
        }
    }
}
