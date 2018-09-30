package design.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 类描述:
 *
 * @createdtime 2018/9/29
 */
public class Emperor {

    private static int maxNum = 2;

    private static List<String> names = new ArrayList<>();
    private static List<Emperor> emperors = new ArrayList<>();
    private static int sort = 0;

    private Emperor() {
    }

    private Emperor(String name) {
        names.add(name);
    }

    static {
        for(int i = 0;i < maxNum; i++){
            emperors.add(new Emperor("皇帝"+i));
        }
    }

    public static Emperor getInstance(){
        Random random = new Random();
        sort = random.nextInt(maxNum);
        return emperors.get(sort);
    }

    public static void say(){
        System.out.println(names.get(sort));
    }
}
