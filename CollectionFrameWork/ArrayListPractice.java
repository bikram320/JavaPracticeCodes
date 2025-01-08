package CollectionFrameWork;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[]args){

        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();
            for(int i =0 ; i<3 ; i++){
                System.out.println("Enter a Name :");
                names.add(sc.nextLine());
            }
            Collections.sort(names);
            for(String name : names){
                System.out.println(name);
            }
        }catch (Exception e ) {
            System.out.println("SomeThing Wrong , Run time Error");
        }
    }
}
