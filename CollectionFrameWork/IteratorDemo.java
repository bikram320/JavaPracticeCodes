package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        /*
        An Iterator is an object that is used to iterate (or traverse) through the elements of a collection.
        It provides the actual mechanism to access elements one by one and
        perform operations like hasNext(), next(), and remove().
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("Cris");
        list.add("Leo");
        list.add("Kevin");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.equals("Leo")){
                iterator.remove();
            }
            System.out.println(name);
        }
    }
}
