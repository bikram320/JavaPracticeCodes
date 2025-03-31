package DSA_Problems.HashMap;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,2,3,};

        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int num : arr){
            //if num is already in the hashmap then increasing its count
            if(frequency.containsKey(num)){
                frequency.put(num,frequency.get(num)+1);
            }else{
                frequency.put(num,1);
            }
        }
        System.out.println(frequency);
    }
}
