package CollectionFrameWork;

import java.util.Vector;

public class VectorInJava {
    public static void main(String[]args){
        /*
            vector can be initialized in a four way
            1 . without giving any size (size will be initially set to be 10 )
            2 . with size (like new Vector<>(18);
            3 . with size and incrementer ( when user add more than the initialize size vector automatically double
                   the size And we can give A incrementer size as well which will increment a size of vector after
                   additional data add on it )
             4 . with another collection in constructor like ( new Vector<>(new Arraylist<>());
        */

        // vector is synchronized collection , so it is thread safe but arraylist is not

        Vector<Integer> vector = new Vector<>();
        //adding the value in vector
        vector.add(10);
        vector.add(11);
        vector.add(13);
        vector.add(14);
        vector.add(15);
        vector.add(16);
        vector.add(17);
        vector.add(18);

        // adding the value on given index
        vector.add(3,20);//adds the 20 value at the index 3 and value of 3 will be push to index 4 and so on

        // we can replace the value on vector
        vector.set(2,14); // replace the value on index to with 14

        // we can remove the data in vector
        vector.remove(4);//remove the value from the index 4

        // we can retrieve the value of given index
        System.out.println(vector.get(3));

        System.out.println(vector.size());// returns the size of vector

       // vector.clear(); removes the all data from vector

        System.out.println(vector);
    }
}
