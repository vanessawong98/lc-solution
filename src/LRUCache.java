import java.util.*;
import java.util.stream.Collectors;

public class LRUCache {

    private int maxCapacity;
    private LinkedList<Map<Integer, Integer>> cacheList;

    public LRUCache(int capacity) {
        try {
            if (capacity <= 0 || capacity >= 3000) {
                throw new Exception("Err: Capacity must be more than 0 and less than equals to 3000");
            }
            cacheList = new LinkedList<>();
            maxCapacity = capacity;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int get(int key) {
        if (listContainsKey(key)) {
            Map<Integer, Integer> toRemap = cacheList.stream().filter(m -> m.containsKey(key)).toList().get(0);
            cacheList.remove(toRemap);
            cacheList.addFirst(toRemap);
            return toRemap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cacheList != null) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(key, value);

            if (listContainsKey(key)){
                List<Map<Integer, Integer>> list = cacheList.stream().filter(m -> m.get(key) != null).toList();
                Map<Integer, Integer> toRemove = list.get(0);
                cacheList.remove(toRemove);
                cacheList.addFirst(map);
            } else {
                if (cacheList.size() < maxCapacity) {
                    cacheList.addFirst(map);
                } else {
                    cacheList.removeLast();
                    cacheList.addFirst(map);
                }
            }
        }
    }

    private boolean listContainsKey(int key) {
        List<Map<Integer, Integer>> filter = cacheList.stream().filter(m -> m.containsKey(key)).toList();
        return !filter.isEmpty();
    }
}
