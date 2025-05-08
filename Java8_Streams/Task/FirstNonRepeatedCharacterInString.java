package Java8_Streams.Task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInString {
    public static void main(String[] args) {
        /*
        this task or problem is to find out the first non-repeated character in String
         */

        String str = "abcdabccdegfi";
        Optional<Character> first = str.chars()
                //Change string to char
                .mapToObj(c -> (char) c)
                //function.identity() returns character as it as , and then we used linkedhashmap to
                //store key and value and ,it maintains the insertion order and
                //collectors.counting() for count the character
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(first.orElse(null));

    }
}
