package loader;

/**
 * 类描述:
 *
 * @createdtime 2018/9/4
 */
public class Reload {

    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Son();
        Father daughter = new Daughter();
        son.say(new Son());
        father.say(new Son());
    }
}

class Father{
    public void say(Father father){
        System.out.println("i am father");
    }
    public void say(Son son) {
        System.out.println("i am father-son");
    }
}
class Son extends Father{
    public void say(Son son) {
        System.out.println("i am son");
    }
}
class Daughter extends Father{
    public void say(Daughter daughter) {
        System.out.println("i am Daughter");
    }
}
