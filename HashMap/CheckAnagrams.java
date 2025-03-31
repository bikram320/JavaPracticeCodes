package DSA_Problems.HashMap;

import java.util.HashMap;

public class CheckAnagrams {
    public static boolean isAnagrams(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character , Integer> charCount = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch,0) + 1);
        }
        for (char ch : s2.toCharArray()){
            if(!charCount.containsKey(ch)){
                return false;
            }
            charCount.put(ch,charCount.get(ch)-1);
            if(charCount.get(ch)==0){
                charCount.remove(ch);
            }
        }
        return charCount.isEmpty();

    }
    public static void main(String []args){
        String s1 = "Bikram";
        String s2 = "Bicky";

        if (isAnagrams(s1.toLowerCase(), s2.toLowerCase())) {
            System.out.println(s1+" and "+s2+" are Anagrams");
        }else{
            System.out.println(s1+" and "+s2+" are not Anagrams");
        }
    }

}
