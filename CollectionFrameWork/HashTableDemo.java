package CollectionFrameWork;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        /*
            HashTable is a data structure that implements the Map interface and store values in key value pairs
            some key points
            -store in key-value pairs
            -thread safe or Synchronized
            -don't accept null key or null values
            -order is not maintained
         */
        Hashtable<Integer, Car> hashtable = new Hashtable<>();
        hashtable.put(1,new Car("BMW"));
        hashtable.put(2,new Car("Ferrari"));
        hashtable.put(3,new Car("Lambo"));
        hashtable.put(4,new Car("Volvo"));

        System.out.println(hashtable);

        hashtable.remove(3);

        System.out.println(hashtable.get(3));
        System.out.println(hashtable.containsValue("BMW"));
        System.out.println(hashtable.containsKey(1));

        for (Map.Entry<Integer,Car> hash : hashtable.entrySet()){
            System.out.println(hash.getKey()+" "+hash.getValue());
        }


    }
}
class Car{
    String name ;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
