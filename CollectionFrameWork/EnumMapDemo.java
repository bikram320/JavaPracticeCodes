package CollectionFrameWork.Map;

import java.util.EnumMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        /*
          It is a Map implementation designed specifically for use with enum keys.
          It's faster and more memory-efficient than other maps like HashMap when the keys are enums.
         */
        EnumMap<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY,"DSA");
        map.put(Day.THRUSDAY,"JAVA");
        map.put(Day.SUNDAY,"PROJECT");
        /*
        Keys must be of enum type.
        It maintains the natural order of enum constants (declaration order).
        It's not thread-safe (wrap it with Collections.synchronizedMap() if needed).
        */

        System.out.println(map);
    }
}
enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY;
}
