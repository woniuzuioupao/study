package loader;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:
 *
 * @createdtime 2018/9/3
 */
public class Slot {

    public static void main(String[] args) {
       /* {
            byte[] bytes = new byte[64*1024*1024];
        }
        int a = 0;
        System.gc();*/

        c1 c1 = new c1();
        c1.setName("c1name");
        c1.setNick("c1nick");
        c2 c2 = new c2();
        c2.setAge(123);

    }
}
class c1{
    private String name;
    private String nick;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
class c2{
    private String name;
    private String nick;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
