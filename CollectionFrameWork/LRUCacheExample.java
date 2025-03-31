package CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K , V> extends LinkedHashMap<K ,V>{
    private final int MaxSize;

    LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.MaxSize = capacity;
    }

    //override this Method for removing the data when it exceeds the maxsize
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>MaxSize;
    }
}

public class LRUCacheExample {
    public static void main(String []args){

        LRUCache<Integer,String > lruCache = new LRUCache<>(4);
        lruCache.put(1,"John");
        lruCache.put(2,"Joe");
        lruCache.put(3,"Joseph");
        lruCache.put(4,"Andrew");
        System.out.println(" after inserting 4 items : "+lruCache);

        //let access and see the order od items
        lruCache.get(2);
        lruCache.get(1);
        System.out.println("After accessing the 1 and 2 : "+lruCache);

        //Adding two more items that exceeds the size of lru and then remove the least Recently used items which is 3 and 4
        lruCache.put(5,"Adam");
        lruCache.put(6,"Issac");
        System.out.println("After Inserting 5 and 6 : "+lruCache);
    }
}
