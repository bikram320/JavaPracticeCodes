package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class letsCompare implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10 >o2%10){
            return 1;
        }else{
            return -1;
        }
    }
}
class CompareString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length()){
            return 1 ;
        }else if(o2.length()>o1.length()){
            return -1 ;
        }
        else{
            return 0;
        }
    }

}

public class ComparatorInJava {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(90);
        list.add(34);
        list.add(37);
        list.add(28);
        list.add(45);

        list.sort(new letsCompare());
        System.out.println(list);


        List<String> strings = new ArrayList<>();
        strings.add("John");
        strings.add("Daniel");
        strings.add("jack");
        strings.add("joe");
        strings.sort(new CompareString());
        System.out.println(strings);
    }
}
