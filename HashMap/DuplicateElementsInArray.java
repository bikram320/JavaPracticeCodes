package DSA_Problems.HashMap;

import java.util.HashMap;

public class DuplicateElementsInArray {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,2,4,6,7};

        HashMap<Integer,Integer> duplicate = new HashMap<>();

        for(int num : arr){
            if(duplicate.containsKey(num)){
                duplicate.put(num,duplicate.get(num)+1);
            }else{
                duplicate.put(num,1);
            }
        }
        System.out.println("Duplicate :");
        for(int key : duplicate.keySet()){
            if(duplicate.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }
}
