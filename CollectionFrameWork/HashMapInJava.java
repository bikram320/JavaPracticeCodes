package CollectionFrameWork;

import java.util.HashMap;
import java.util.*;

public class HashMapInJava {
    public static void main(String[]args){
        //creating a hashmap which takes two types one for Keys and One for Values
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1,"Andrew");
        map.put(4,"Leo");
        map.put(3,"Cris");
        map.put(2,"Kevin");
        map.put(11,"Eden");
        map.put(9,"Luis");

        System.out.println(map);

        System.out.println(map.get(11));

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Cris"));

        System.out.println("By using Entryset Iterator :");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // for work with only keys
        System.out.println("Working only with keys");
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            System.out.println(key);
        }

        map.remove(9);
        System.out.println("After Removing the key 9"+map);


    }
}
