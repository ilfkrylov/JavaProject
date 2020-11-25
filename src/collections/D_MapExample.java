package collections;

import java.util.HashMap;
import java.util.Map;

public class D_MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.get("");
        map.put("key", "value");
        map.entrySet();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

    }
}
