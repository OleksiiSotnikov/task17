package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SwapTest {
    @Test
    public void Test(){
        Map<String, Integer> map = new HashMap<>();
        map.put("1+5", 6);
        map.put("2+3", 5);
        map.put("3+1", 4);
        map.put("4-1", 3);
        map.put("5-3", 2);
        map.put("6-5", 1);
        Map<Integer, String> result = new HashMap<>();
        result.put(6,"1+5");
        result.put(5, "2+3");
        result.put(4, "3+1");
        result.put(3, "4-1");
        result.put(2, "5-3");
        result.put(1, "6-5");
        Assertions.assertEquals(result, SwapTest.Swap(map));
    }

    static Map<Integer, String> Swap (Map<String, Integer> map) {
        Set<String> set = map.keySet();
        Map<Integer, String> result = new HashMap<>();
        for (String s : set) {
            result.put(map.get(s), s);
        }
        return result;
    }
}