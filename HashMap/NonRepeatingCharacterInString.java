package DSA_Problems.HashMap;

import java.util.HashMap;

public class NonRepeatingCharacterInString {
    public static void main(String[]args){
        String s1 = "HelloWorld";
        System.out.println("String : "+s1.toLowerCase());

        HashMap<Character , Integer> CharCount = new HashMap<>();

        for(char ch : s1.toLowerCase().toCharArray()){
            CharCount.put(ch,CharCount.getOrDefault(ch,0)+1);
        }
        System.out.print("Non Repeated Character in String : ");
        int RepeatedCount=0;
        for(char ch : s1.toLowerCase().toCharArray()){
            if(CharCount.get(ch)==1){
                System.out.print(ch+" ");
                RepeatedCount++;
            }
        }
        if(RepeatedCount==0){
            System.out.println(" 'There is No Non Repeated Character' .");
        }

    }
}
