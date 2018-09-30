package memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @createdtime 2018/9/20
 */
public class HeapOOM {
    public static void main(String[] args) {
        int x=2;
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
    static class OOMObject{

    }
}
