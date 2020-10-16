package Lab_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static <T>ArrayList<T> newArrayList(T... values) {
        return new ArrayList<>(Arrays.asList(values));
    }

    public static <K, V>HashMap<K,V> newHashMap(K[] keys,  V[] values) {
        HashMap<K,V> hashMap = new HashMap<>();
        for (int i = 0; i < keys.length; i ++){
            hashMap.put(keys[i], values[i]);
        }
        return hashMap;
    }
}
