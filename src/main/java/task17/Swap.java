package task17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Swap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1+5", 6);
        map.put("2+3", 5);
        map.put("3+1", 4);
        map.put("4-1", 3);
        map.put("5-3", 2);
        map.put("6-5", 1);

        Set<String> set = map.keySet();
        Map<Integer, String> result = new HashMap<>();
        for (String s : set)
            result.put(map.get(s), s);

        System.out.println(map);
        System.out.println(result);
    }
}