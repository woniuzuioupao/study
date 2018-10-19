package base;

/**
 * 类描述:
 *
 * @createdtime 2018/10/17
 */
public class Client {

    public static void main(String[] args)throws Exception{

        Father father1 = Father.getFather();
        Father father2 = Father.getFather();
        System.out.println(father1 == father2);
    }
}
class Father{

    private static Father father = null;

    private Father() {
    }

    public static Father getFather()throws Exception{
        if(father == null){
            Thread.sleep(1000);
            father = new Father();
            return father;
        }else{
            return father;
        }
    }

}
